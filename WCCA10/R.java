class R
{
int a=10;
public void print()
{
int b=12;
int a=88;
a=b;
System.out.println(this.a);
}
public static void main(String[]args)
{
R obj=new R();
obj.a=56;
obj.print();
}
}