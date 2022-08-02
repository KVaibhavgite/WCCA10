/*Java String indexOf() Method
Definition and Usage
The indexOf() method returns the position of the first occurrence of specified character(s) in a string.
Tip: Use the lastIndexOf method to return the position of the last occurrence of specified character(s) in a string.

Syntax: There are 4 indexOf() methods:

public int indexOf(String str)
public int indexOf(String str, int fromIndex)
public int indexOf(int char)
public int indexOf(int char, int fromIndex)
Parameter Values
Parameter	Description
str	        A String value, representing the string to search for
fromIndex	An int value, representing the index position to start the search from
char	        An int value, representing a single character, e.g 'A', or a Unicode value
Technical Details
Returns:       An int value, representing the index of the first occurrence of the character in the string,
               or -1 if it never occurs
*/
class  indexOf
{
public static void main(String[]args)
{
    String myStr = "Hello planet earth, you are a great planet.";
    System.out.println(myStr.indexOf("e", 5));//10
    System.out.println(myStr.indexOf("planet"));//6
  }
}