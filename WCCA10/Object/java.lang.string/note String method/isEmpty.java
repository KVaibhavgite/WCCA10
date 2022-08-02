/* Java String isEmpty() Method
Definition and Usage
The isEmpty() method checks whether a string is empty or not.
This method returns true if the string is empty (length() is 0), and false if not.

Syntax: public boolean isEmpty()
Parameters
None.

Technical Details
Returns:	A boolean value:
            true - The string is empty (length() is 0)
            false - The string is not empty
*/
class isEmpty
{
public static void main(String[]args)
{
String myStr1 = "Hello";
String myStr2 = "";
System.out.println(myStr1.isEmpty());//false
System.out.println(myStr2.isEmpty());//true
}
}