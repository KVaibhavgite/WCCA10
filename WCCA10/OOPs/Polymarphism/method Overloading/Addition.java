class Addition
{
public static void add(int a,int b)
{
int sum=a+b;
System.out.println(a+"+"+b+"="+sum);
}
public static void add(int a,int b,int c)
{
int sum=a+b+c;
System.out.println(a+"+"+b+"+"+c+"="+sum);
}
public static void add(int a,int b,int c,int d)
{
int sum=a+b+c+d;
System.out.println(a+"+"+b+"+"+c+"+"+d+"="+sum);
}
public static void main(String[]args)
{
add(10,20);
add(10,20,30);
add(10,20,30,40);
}
}




