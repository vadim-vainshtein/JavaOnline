package strings.regex.task02;

import java.util.ArrayList;

class Node {
	
	private String name;
	private String content;
	
	private Node parent;
	private ArrayList<Node> children;
	
	
	public Node() {
		children = new ArrayList<Node>();
	}
	
	public Node(String name) {
		children = new ArrayList<Node>();
		this.name = name;
		content = "";
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}
	
	public Node getParent() {
		return parent;
	}
	
	public void append(Node child) {
		child.parent = this;
		children.add(child);
	}
	
	public void printTree() {
		this.printTree(-1);
	}
	
	private void printTree(int tabs) {
		
		for(int i = 0; i < tabs; i++) {
			System.out.print("\t");
		}
		
		if(parent != null) {
			System.out.println(name + ": " + content);
		}
		
		for(Node node : children) {
			node.printTree(tabs + 1);
		}
	}
}
