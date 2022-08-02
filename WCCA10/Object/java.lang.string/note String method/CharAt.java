/*Java String charAtAt() Method
Definition and Usage
The charAt() method returns the character at the specified index in a string.
The index of the first character is 0, the second character is 1, and so on.

Syntax: public char charAt(int index)
Parameter Values
Parameter	Description
index	        An int value representing the index of the character to return
Technical Details
Returns:	A char value at the specified index of this string.
                The first char value is at index 0
Throws:	IndexOutOfBoundsException - if index is negative or not less than the length of the specified string.*/
class CharAt
{
  public static void main(String[] args) {
    String myStr = "Hello";
    char result = myStr.charAt(0);
    char result1 = myStr.charAt(1);
    char result2= myStr.charAt(2);
    char result3 = myStr.charAt(3);
    char result4 = myStr.charAt(4);
    System.out.println(result);//H
    System.out.println(result1);//e
    System.out.println(result2);//l
    System.out.println(result3);//l
    System.out.println(result4);//o
    
  }
}
