public class s4
{
public static void main(String[]args)
{
String s1="Hello";
String s2="Hii";
String s3="Hello";
String s4=new String("Hello");
String s5=new String("Hii");
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
System.out.println(s4);
System.out.println(s5);
System.out.println(s1==s2);
System.out.println(s1==s3);
System.out.println(s1==s4);
System.out.println(s1==s5);
System.out.println(s3==s5);
System.out.println(s1.equals(s2));
System.out.println(s1.equals(s3));
System.out.println(s1.equals(s4));
System.out.println(s1.equals(s5));
System.out.println(s3.equals(s5));
//System.out.println(s1.hashCode(s2));//CTE because of hashCode method are not be applicable to String
}
}


