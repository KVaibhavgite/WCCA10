/* if the method is final we can not over ride that method*/
class A
{
final public void display()
{
System.out.println("from display() of A");
}
}

class B
{
public void display()
{
System.out.println("from display() of B");
}
}

class Driver
{
public static void main(String[]args)
{
A a= new B();
a.display();//CTE
}
}
