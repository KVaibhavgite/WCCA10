/* Java String hashCode() Method
Definition and Usage
The hashCode() method returns the hash code of a string.
The hash code for a String object is computed like this:

s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
where s[i] is the ith character of the string, n is the length of the string, and ^ indicates exponentiation.

Syntax: public int hashCode()
Parameter Values
None.

Technical Details
Returns:	An int value, representing the hash code of the string
*/
class hashCode
{
public static void main(String[]args)
{
String myStr = "Hello";
System.out.println(myStr.hashCode());//69609650
}
}
