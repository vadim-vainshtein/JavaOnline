Processing strings as objects of String or StringBuilder classes
=====

Task 1
------

*Count the maximum number of consecutive spaces in a string*

Implemented two methods:

	maxNumberOfSpacesV1();
	maxNumberOfSpacesV2();

The first one doesn't use any special String class methods. The second version is based on String.indexOf(), searching for the substring of 1, 2, etc., spaces. I'm not sure wich version is better. The first version seems to be faster, but I'll know for sure when I'll figure out how to do correct speed tests.
An interesting question is if it's possible to solve the task using a stream. Unfortunately I haven't found any way to do that.


Task 2:
------

*Insert a symbol 'b' after every symbol 'a' in a given string*

Using StringBuilder.insert() and StringBuilder.indexOf() methods

P.S. found a shorter way, using String.replace(). Implemented this in replaceSymbolsAlternative().


Task 3
------

*Check if given word is a palindrome or not*

Using StringBuilder.reverse() method to reverse string and String.equals() to compare them


Task 4
------

*Make word "торт" out of parts of word "информатика" using functions for copying and concatenation*

Using String.substring() and String.concat();


Task 5
------

*Count the number of occurrences of letter 'a' in a given string*

Get an IntStream using String.codePoints(), then filter() and count()


Task 6
------

*Make a new string out of a given one repeating each symbol twice*

Again using IntStream.forEach() to iterate through all the characters, and using a StringBuilder object to make a new string


Task 7
------

*Remove all the spaces and repeated characters from a given string*

Using a StringBuilder object to store the appearing characters. If a character is present in that sequence, then it isn't taken
to the resulting string.

Task 8
------

*Find the longest word in a string*

Using String.split() and String.length()

Task 9
------

*Count the number of small and capital letters in a string*

Implemented class StringProperties, that is used to count number of upper and lower case characters using
Character.isLowerCase() and Character.isUpperCase()

Task 10
------

*A string X consists of several phrases that end with '.', '?' or '!'. Count the number of phrases.*