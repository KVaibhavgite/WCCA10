class T
{
int a=10;
{
a=-7;
System.out.println("SIB");
}
int b=6;
{
System.out.println("NSIB");
System.out.println("a:"+a);
System.out.println("b:"+b);
a =7;
b =a;
}
}
class TD
{
public static void main(String[]args)
{
T obj=new T();
System.out.println("a"+obj.a);
System.out.println("b"+obj.b);
new T();
}
}
