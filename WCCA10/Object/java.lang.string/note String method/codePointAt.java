/*Java String codePointAt() Method
Definition and Usage
The codePointAt() method returns the Unicode value of the character at the specified index in a string.
The index of the first character is 0, the second character is 1, and so on.

Syntax: public int codePointAt(int index)
Parameter Values:
Parameter	Description
index	        An int value, representing the index of the character to return
Technical Details
     Returns:	An int value, representing the Unicode value of the character at the index
      Throws:	IndexOutOfBoundsException - if index is negative or not less than the length of the specified string
Java Version:	1.5  */
 class codePointAt
 {
  public static void main(String[] args) {
    String myStr = "Hello";
    int result = myStr.codePointAt(0);
    int result1 = myStr.codePointAt(1);
    int result2 = myStr.codePointAt(2);
    int result3 = myStr.codePointAt(3);
    int result4= myStr.codePointAt(4);
    System.out.println(result);//72
    System.out.println(result1);//101
    System.out.println(result2);//108
    System.out.println(result3);//108
    System.out.println(result4);//111
  }
}

