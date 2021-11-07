package strings.regex.task02;

class Tag {
	
	public static final byte TYPE_OPEN = 0;
	public static final byte TYPE_CLOSE = 1;
	public static final byte TYPE_OPEN_CLOSE = 2;
	
	private final String OPEN_TAG_PATTERN = "<[^>^/]+>";
	private final String CLOSE_TAG_PATTERN = "</[^>]+>";
		
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
		else {
			type = TYPE_OPEN_CLOSE;
		}
	}	
	
	
	private void separateAttrString() {
			//not implemented yet
			attrString = "";
	}
}
