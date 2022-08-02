class L
{
int a;
int b;
int c;
L(int a,int b,int c)
{
this.a=a;
this.b=b;
this.c=c;
System.out.println("from L(int,int,int)");
}
L(int a,int b)
{
this.a=a;
this.b=b;
System.out.println("From L(int,int)");
}
L(int a)
{
this.a=a;
System.out.println("From L(int)");
}
L()
{
System.out.println("From L()");
}
}
class LD
{
public static void main(String[]args)
{
L l1=new L();
L l2=new L(10);
L l3=new L(10,20);
L l4=new L(10,20,30);}
}