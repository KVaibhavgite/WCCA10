/* Java String equals() Method
Definition and Usage
The equals() method compares two strings, and returns true if the strings are equal, and false if not.
Tip: Use the compareTo() method to compare two strings lexicographically.

Syntax: public boolean equals(Object anotherObject)
Parameter Values
Parameter	Description
anotherObject	An Object, representing the other string to be compared
Technical Details
Returns:	A boolean value:
               true - if the strings are equal
               false - if the strings are not equal
Overrides:	equals in class Object
*/
class equals
{
public static void main(String[]args)
{
String myStr1 = "Hello";
String myStr2 = "Hello";
String myStr3 = "Another String";
System.out.println(myStr1.equals(myStr2)); // Returns true because they are equal
System.out.println(myStr1.equals(myStr3)); // false
}
}