/* Java String trim() Method
Definition and Usage
The trim() method removes whitespace from both ends of a string.

Note: This method does not change the original string.

Syntax: public String trim()
Parameters
None.

Technical Details
Returns:	A String value, which is a copy of the string, without leading and trailing whitespace
*/
class trim
{
public static void main(String[]args)
{
String myStr = "       Hello World!       ";
System.out.println(myStr);//       Hello World!
System.out.println(myStr.trim());//Hello World! 
}
}