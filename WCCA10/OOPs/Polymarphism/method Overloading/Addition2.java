class Addition2
{
public static int add(int a,int b)
{
int sum=a+b;
System.out.println(a+"+"+b+"="+sum);
return;
}
public static long add(int a,int b,int c)
{
int sum=a+b+c;
System.out.println(a+"+"+b+"+"+c+"="+sum);
return;
}
public static int add(int a,int b,int c,int d)
{
int sum=a+b+c+d;
System.out.println(a+"+"+b+"+"+c+"+"+d+"="+sum);
return;
}
public static void main(String[]args)
{
int a=add(10,20);
long a=add(10,20,30);
int a=add(10,20,30,40);
}
}