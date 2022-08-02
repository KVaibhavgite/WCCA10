class S3
{
static int a;
{
System.out.println(" form static block1");
a=25;
}
public static void main(String[]args)
{
System.out.println(a);//0
int a=25;
System.out.println(a);//25
}
}