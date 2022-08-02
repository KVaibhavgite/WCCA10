class String1
{
public static void main(String[]args)
{
String s1="Hello";
String s2="Hello";
String s3="hii";
String s4="";
System.out.println(s1);//Hello
System.out.println(s4);//
System.out.println(s3);//hii
System.out.println(s2);//Hello
System.out.println(s1==s2);//true
System.out.println(s1==s3);//false
System.out.println(s1==s4);//false
System.out.println(s2==s3);//false
System.out.println(s2==s4);//false
System.out.println(s3==s4);//false
System.out.println(s1.equals(s2));//true
System.out.println(s1.equals(s3));//false
System.out.println(s1.equals(s4));//false
System.out.println(s2.equals(s3));//false
System.out.println(s2.equals(s4));//false
System.out.println(s3.equals(s4));//false
}
}