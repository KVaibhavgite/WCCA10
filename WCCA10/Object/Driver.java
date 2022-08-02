class A
{
final public void display()
{
System.out.println("from display() of A");
}
}


class Driver
{
public static void main(String[]args)
{
A a=new A();
System.out.println(a);//A@4617c264
System.out.println(a.toString());//A@4617c264
}
}
