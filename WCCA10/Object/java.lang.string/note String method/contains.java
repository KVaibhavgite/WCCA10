/* Java String contains() Method
Definition and Usage
The contains() method checks whether a string contains a sequence of characters.
Returns true if the characters exist and false if not.

Syntax : public boolean contains(CharSequence chars)
Parameter Values
Parameter	        Description
CharSequence chars	The characters to be searched for
note..The CharSequence interface is a readable sequence of char values, found in the java.lang package.

Technical Details
Returns:	A boolean, indicating whether a sequence of characters exist in the specified string:
                true - sequence of characters exists
                false - sequence of characters do not exist
Throws: 	NullPointerException - if the returned value is null
Java Version:	1.5
*/
class contains
{
public static void main(String[]args)
{
String myStr = "Hello";
System.out.println(myStr.contains("Hel"));   // true
System.out.println(myStr.contains("e"));     // true
System.out.println(myStr.contains("Hi"));    // false
}
}
