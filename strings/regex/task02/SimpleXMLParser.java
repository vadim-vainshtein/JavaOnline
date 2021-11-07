package strings.regex.task02;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class SimpleXMLParser {
	
	private final String TAG_PATTERN = "</?.[^>]+>";
	
	private Node rootNode;
	

	public SimpleXMLParser(String text) {
		
		parseText(text);
	}
	

	private void parseText(String text) {
		
		rootNode = new Node();
		
		Pattern tagPattern = Pattern.compile(TAG_PATTERN);
		Matcher tagMatcher = tagPattern.matcher(text);
		int prevTagEnd = 0;
		Node currentNode = rootNode;
		
		while(tagMatcher.find()) {
			
			int tagStart = tagMatcher.start();
			int tagEnd = tagMatcher.end();
			
			Tag tag = new Tag(text.substring(tagStart + 1, tagEnd - 1));
			Node node;
			
			switch(tag.getType()) {
				
				case Tag.TYPE_OPEN:
					node = new Node(tag.getName());
					currentNode.append(node);
					currentNode = node;
					break;
					
				case Tag.TYPE_CLOSE:
					String content = text.substring(prevTagEnd, tagStart);
					if(!content.isBlank()) {
						currentNode.setContent(content);
					}
					currentNode = currentNode.getParent();
					break;
					
				case  Tag.TYPE_EMPTY:
					node = new Node(tag.getName());
					currentNode.append(node);
					break;
			}
			
			prevTagEnd = tagEnd;
		}
	}
	
	
	public void printTree() {
		rootNode.printTree();
	}
}
