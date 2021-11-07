package strings.regex.task02;

import java.util.ArrayList;

class Node {
/**
 * A class describing a node of an xml document. Contains information about a tag, possible content of a node,
 * and the list of child nodes and the parent node as well
 */
	
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
		/**
		 * Prints the xml document tree, starting from this. The printing itself happens in a recursive method printTree(int) to get the correct number of tabulations before each node.
		 */
		
		// if the node is a root node (parent == null),  we will not print it at all, and we don't need any tabs before it's children,
		// so the number of tabulations for this node is -1. For it's children it will be thus 0.
		if(parent == null) {
			this.printTree(-1);
		}
		else {
			this.printTree(0);
		}
	}
	
	private void printTree(int tabs) {
	/**
	 * Prints this node and all it's children recursively. Prints the 'tabs' number of tabulation symbols before the content,
	 * and 'tabs+1' tabulations before each child. Doesn't print the content of a root node, because it is just a container for whole the tree.
	 */
	
	//do not print the root node
		if(parent != null) {

			for(int i = 0; i < tabs; i++) {
				System.out.print("\t");
			}

			System.out.println(name + ": " + content);
		}
		
	//print the child nodes
		for(Node node : children) {
			node.printTree(tabs + 1);
		}
	}
}
