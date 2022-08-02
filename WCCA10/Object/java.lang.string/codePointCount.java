/* Java String codePointCount() Method
Definition and Usage
The codePointCount() method returns the number of Unicode values found in a string.
Use the startIndex and endIndex parameters to specify where to begin and end the search.
The index of the first character is 0, the second character is 1, and so on.

Syntax: public int codePointCount(int startIndex, int endIndex)
Parameter Values
Parameter	Description
startIndex : An int value, representing the index to the first character in the string
endIndex   : An int value, representing the index after the last character in the string
Technical Details
Returns:	An int value, representing the number of Unicode values found in a string
Throws:	        IndexOutOfBoundsException - if startIndex is negative, or endindex is larger than the length of the string, or startIndex is larger than endIndex
Java Version:	1.5  */
class codePointCount 
{
  public static void main(String[] args) {
    String myStr = "Hello";
    int result = myStr.codePointCount(0, 5);
    int result1 = myStr.codePointCount(0, 4);
    int result2 = myStr.codePointCount(0, 3);
    int result3 = myStr.codePointCount(0, 2);
    int result4 = myStr.codePointCount(0, 1);
    System.out.println(result);//5
    System.out.println(result1);//4
    System.out.println(result2);//3
    System.out.println(result3);//2
    System.out.println(result4);//1
  }
}
