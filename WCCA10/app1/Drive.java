class A
{
int a;
int b;
A(int a,int b)
{
this.a=a;
this.b=b;
}
void display()
{
System.out.println("main Start");
System.out.println("int a"+a);
System.out.println("int b"+b);
System.out.println("main end");
}
void adisplay()
{
if(a==a)
{
System.out.println("int a");
}
else
{
System.out.println("not int a");
}
}
void bdisplay()
{
if(b!=b)
{
System.out.println("not int b");
}
else
{
System.out.println("int b");
}
}

class Drive
{
public static void main(String[]args)
{
A a1=new A(10,20);
a1.display();
a1.adisplay(20);
a1.bdisplay(40);
}
}