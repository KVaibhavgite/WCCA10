/* Java String endsWith() Method
Definition and Usage
The endsWith() method checks whether a string ends with the specified character(s).
Tip: Use the startsWith() method to check whether a string starts with the specified character(s).

Syntax: public boolean endsWith(String chars)
Parameter Values
Parameter	Description
chars	        A String, representing the character(s) to check for
Technical Details
Returns:	A boolean value:
             true - if the string ends with the specified character(s)
             false - if the string does not end with the specified character(s)
*/
class endWith
{
public static void main(String[]args)
{
String myStr = "Hello";
System.out.println(myStr.endsWith("Hel"));   // false
System.out.println(myStr.endsWith("llo"));   // true
System.out.println(myStr.endsWith("o"));     // true
}
}