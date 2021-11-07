Working with regular expressions
=====

Task 1
------

*Create a text parsing application (text is stored in a string), that implements three operations:
- Sort paragraphs by the number of sentences
- Sort words in every sentence by length
- Sort words in every sentence by number of occurrences of a given character in descending order. In a case of equality sort by alphabetical order.*

Implemented

	class TextPiece implements Comparable

for simple splitting of text into pieces (paragraphs, sentences, etc.) and working with arrays of those pieces. There is also
	
	class Word extends TextPiece

that is used for comparing words by number of occurrences of a given character.

There is a problem with methods buildArray() and arrayToString(), they are both implemented twice in the classes. At the moment I don't understand how to do that more efficiently.

The

	class MyParser

uses TextPiece and Word to do all the sorts needed in methods
	
	Paragraphs();
	sortWordsByLength();
	sortWordsByCharOccurrence();


Task 2
-----

There is a string containing a text (xml-document): 

	<notes> 
		<note id = "1"> 
			<to>Вася</to> 
			<from>Света</from> 
			<heading>Напоминание</heading> 
			<body>Позвони мне завтра!</body> 
		</note> 
		<note id = "2"> 
			<to>Петя</to> 
			<from>Маша</from> 
			<heading>Важное напоминание</heading> 
			<body/> 
		</note> 
	</notes> 

Write a parser that allows to sequentially return the contents of the nodes and their types (opening tag, closing tag, content of the tag, tag without body). Don't use any ready-made xml-parsers.


Implemented a class SimpleXMLParser, using a class Node to store the tree of XML nodes and a class Tag to analyze the tags. 
