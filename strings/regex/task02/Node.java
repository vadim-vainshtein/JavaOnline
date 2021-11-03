package strings.regex.task02;

class Node {
	
	private String name;
	private String content;
	
	private Node parent;
	private ArrayList<Node> children;
	
	
	public Node() {
		children = new ArrayList<Node>;
	}
	
	public Node(String name) {
		Node();
		this.name = name;
		content = "";
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}
	
	public void append(Node child) {
		child.parent = this;
		children.add(child);
	}
}
