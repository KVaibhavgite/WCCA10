/* Java String contentEquals() Method
Definition and Usage
The contentEquals() method searches a string to find out if it contains the exact same sequence of characters in the specified string or StringBuffer.
Returns true if the characters exist and false if not.

Syntax :There are 2 contentEquals() methods:
           *public boolean contentEquals(StringBuffer chars)
           *public boolean contentEquals(CharSequence chars)

Parameter Values
Parameter	        Description
StringBuffer chars	The StringBuffer to be searched for
CharSequence chars	The sequence of characters to be searched for
note..The StringBuffer class is like a String, only it can be modified, found in the java.lang package.
    ..The CharSequence interface is a readable sequence of char values, found in the java.lang package.

Technical Details
Returns:	A boolean, indicating whether the exact same sequence of characters exist in the specified string (or StringBuffer):
               true - sequence of characters exists
                false - sequence of characters do not exist
Java Version:	1.4 (contentEquals (StringBuffer chars))
                1.5 (contentEquals (CharSequence chars))
*/
class contantEquals
{
public static void main(String[]args)
{
String myStr = "Hello";
System.out.println(myStr.contentEquals("Hello"));  // true
System.out.println(myStr.contentEquals("e"));      // false
System.out.println(myStr.contentEquals("Hi"));     // false
}
}