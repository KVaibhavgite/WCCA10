public class S2
{
public static void main(String[]args)
{
String s1="Hello";
String s2="Hello";
System.out.println(s1);//Hello
System.out.println(s2);//Hello
System.out.println(s1==s2);//true
System.out.println(s1.equals(s2));//true
s1=s1+"hii";
System.out.println(s1);//Hellohii
System.out.println(s2);//Hello
System.out.println(s1==s2);//false
System.out.println(s1.equals(s2));//false
}
}
