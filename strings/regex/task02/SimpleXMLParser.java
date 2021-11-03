package strings.regex.task02;

import java.util.Pattern;
import java.util.Matcher;

class SimpleXMLParser {
	
	private final String TAG_PATTERN = "</?.[^>]+>";
	
	private Node rootNode;
	

	public SimpleXMLParser(String text) {
		
		parseText(text);
	}
	

	private void parseText(String text) {
		
		rootNode = new Node();
		
		Pattern tagPattern = Pattern.compile(TAG_PATTERN);
		Matcher tagMatcher = tagPattern.matcher();
		int prevTagEnd = 0;
		Node currentNode = rootNode;
		
		while(tagMatcher.find()) {
			
			int tagStart = tagMatcher.start();
			int tagEnd = tagMatcher.end();
			
			Tag tag = new Tag(text.substring(tagStart, tagEnd));
			
			switch(tag.type) {
				
				case Tag.TYPE_OPEN:
					Node node = new Node(tag.name);
					//node.setAttributes(tag.attrString);
					currentNode.append(node);
					currentNode = node;
					break;
					
				case Tag.TYPE_CLOSE:
					String content = text.substring(prevTagEnd + 1, tagStart - 1);
					if(!content.isEmpty()) {
						currentNode.setContent(content);
					}
					break;
					
				case  Tag.TYPE_OPEN_CLOSE:
					Node node = new Node(tag.name);
					currentNode.append(node);
					break;
			}
			
			prevTagEnd = tagEnd;
		}
	}
	
	
	public void printTree() {
		
	}
	
	private printNode(Node node) {
		System.out.println(node.name + ": " + node.content);
		for(Node child : 
	}
}
