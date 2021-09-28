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

