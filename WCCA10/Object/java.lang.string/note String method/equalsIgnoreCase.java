/* Java String equalsIgnoreCase() Method
Definition and Usage
The equalsIgnoreCase() method compares two strings, ignoring lower case and upper case differences.
This method returns true if the strings are equal, and false if not.
Tip: Use the compareToIgnoreCase() method to compare two strings lexicographically, ignoring case differences.

Syntax: public boolean equalsIgnoreCase(String anotherString)
Parameter Values
Parameter	Description
anotherString  	A String, representing the other string to be compared
Technical Details
Returns:	A boolean value:
                true - if the strings are equal, ignoring case differences
                false - if the strings are not equal
*/
class equalsIgnoreCase
{
	public static void main(String[]args)
	{
     String myStr1 = "Hello";
String myStr2 = "HELLO";
String myStr3 = "Another String";
System.out.println(myStr1.equalsIgnoreCase(myStr2)); // true
System.out.println(myStr1.equalsIgnoreCase(myStr3)); // false
	}
}