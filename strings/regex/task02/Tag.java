package strings.regex.task02;

class Tag {
	
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
		
		if(name.matches(OPEN_TAG_PATTERN)) {
			type = TYPE_OPEN;
		}
		else if(name.matches(CLOSE_TAG_PATTERN)) {
			type = TYPE_CLOSE;
		}
		else if(name.matches(EMPTY_TAG_PATTERN)){
			type = TYPE_EMPTY;
			name = name.substring(0, name.length() - 1);
		}
		
		else {
			type = TYPE_INVALID;
		}
	}	
	
	
	private void separateAttrString() {
			//not implemented yet
			attrString = "";
	}
}
