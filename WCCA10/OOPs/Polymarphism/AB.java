class A
{
public void demo()
{
System.out.println("demo() of A");
}
}
class B extends A
{
public void demo()
{
System.out.println("demo () of B");
}
}
class AB
{
public static void main(String[]args)
{
A a=new B();
a.demo();//demo() B
}
}
