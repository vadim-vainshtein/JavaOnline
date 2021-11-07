package strings.regex.task02;

class Tag {
/**
 * This class is used to analyze XML tags: name, type (<opening>, </closing> or <empty/>),
 * and get attributes of the tag
 */

	public static final byte TYPE_OPEN = 0;
	public static final byte TYPE_CLOSE = 1;
	public static final byte TYPE_EMPTY = 2;
	public static final byte TYPE_INVALID = -1;
	
	private final String OPEN_TAG_PATTERN = "[^>^/]+";
	private final String CLOSE_TAG_PATTERN = "/[^>]+";
	private final String EMPTY_TAG_PATTERN = "[^>]+/";
		
	private String name;
	private byte type;
	private String attrString;
	
	
	public Tag(String name) {
	/**
	 * @param name - a text between '<' and '>' symbols in an xml tag. It may contain name of the tag and some attributes
	 */
		this.name = name;
		analyzeType();
		separateAttrString();
	}
	
	public byte getType() {
		return type;
	}
	
	public String getName() {
		return name;
	}
	
	
	private void analyzeType() {
		/**
		 * initializes the type variable depending on a type of the tag
		 */
		
		if(name.matches(OPEN_TAG_PATTERN)) {
			type = TYPE_OPEN;
		}
		else if(name.matches(CLOSE_TAG_PATTERN)) {
			type = TYPE_CLOSE;
		}
		else if(name.matches(EMPTY_TAG_PATTERN)){
			type = TYPE_EMPTY;
			// if a tag is empty, we need to remove last '/' symbol to have a clean tag name
			name = name.substring(0, name.length() - 1);
		}
		
		else {
			type = TYPE_INVALID;
		}
	}	
	
	
	private void separateAttrString() {
	/**
	 * separates attributes string from the tag text
	 */
			//not implemented yet
			attrString = "";
	}
}
