class A
{
static int a=12;
static
{
a=78;
}
public static void main(String[]args)
{
a=76;
}
}
class B
{
public static void main(String[]args)
{
System.out.println(A.a);
}
}															