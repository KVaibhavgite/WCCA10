/* Java String compareToIgnoreCase() Method
Definition and Usage
The compareToIgnoreCase() method compares two strings lexicographically, ignoring lower case and upper case differences.
The comparison is based on the Unicode value of each character in the string converted to lower case.
The method returns 0 if the string is equal to the other string, ignoring case differences. A value less than 0 is returned if the string is less than the other string (less characters) and a value greater than 0 if the string is greater than the other string (more characters).

Syntax: public int compareToIgnoreCase(String string2)
Parameter Values
Parameter	Description
string2	         A String, representing the other string to be compared
Technical Details
Returns:	An int value: 0 if the string is equal to the other string, ignoring case differences.
               < 0 if the string is lexicographically less than the other string
               > 0 if the string is lexicographically greater than the other string (more characters)
Java Version:	1.2
*/
class compareToIgnoreCase
{
public static void main(String[]args)
{
String myStr1 = "HELLO";
String myStr2 = "hello";
System.out.println(myStr1.compareToIgnoreCase(myStr2));//Returns 0 because they are equal
}
}