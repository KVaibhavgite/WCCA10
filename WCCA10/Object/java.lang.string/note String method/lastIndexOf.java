/* Java String lastIndexOf() Method
Definition and Usage
The lastIndexOf() method returns the position of the last occurrence of specified character(s) in a string.
Tip: Use the indexOf method to return the position of the first occurrence of specified character(s) in a string.

Syntax: There are 4 lastIndexOf() methods:

public int lastIndexOf(String str)
public int lastIndexOf(String str, int fromIndex)
public int lastIndexOf(int char)
public int lastIndexOf(int char, int fromIndex)
Parameter Values
Parameter	Description
str	        A String value, representing the string to search for
fromIndex	An int value, representing the index position to start the search from. If omitted, the default value is the length of the string
char	        An int value, representing a single character, e.g 'A', or a Unicode value
Technical Details
Returns:	An int value, representing the index of the first occurrence of the character in the string,
               or -1 if it never occurs.
*/
class lastIndexOf
{
public static void main(String[]args)
{
String myStr = "Hello planet earth, you are a great ";
//String myStr = "Hello planet earth, you are a great planet ";
    System.out.println(myStr.lastIndexOf("e", 5));//1
    System.out.println(myStr.lastIndexOf("planet"));//6
	//System.out.println(myStr.lastIndexOf("planet"));//36
  }
}