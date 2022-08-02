/* Java String copyValueOf() Method
Definition and Usage
The copyValueOf() method returns a String that represents the characters of a char array.
This method returns a new String array and copies the characters into it.

Syntax: public static String copyValueOf(char[] data, int offset, int  count)
Parameter Values
Parameter	Description
data	        A char array
offset	        An int value, representing the start index of the char array
count	        An int value, representing the length of the char array
Technical Details
Returns:	A String, representing the characters of the char array
Throws:	       StringIndexOutOfBoundsException - if offset is negative or out of reach, 
                 or if count is greater than the length of the char array, or negative
*/
class copyValueOf
{
public static void main(String[]args)
{
char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
String myStr2 = "";
myStr2 = myStr2.copyValueOf(myStr1, 0, 5);
System.out.println("Returned String: " + myStr2);//Returned String: Hello

}
}
