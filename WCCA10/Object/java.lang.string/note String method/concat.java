/* Java String concat() Method
Definition and Usage
The concat() method appends (concatenate) a string to the end of another string.

Syntax: public String concat(String string2)
Parameter Values
Parameter	Description
string2	       A String, representing the string that should be appended to the other string
Technical Details
Returns:	A String, representing the text of the combined strings
*/
class concat
{
public static void main(String[]args)
{
String firstName = "John ";
String lastName = "Doe";
System.out.println(firstName.concat(lastName));//John Doe
}
}