class S6
{
static int a=test();
static int b=demo();
public static int test()
{
System.out.println("------test()start------");
System.out.println("a:"+a);
System.out.println("b:"+b);
System.out.println("------test()end------");
return 20;
}
 public static int demo()
{
System.out.println("------test()start------");
System.out.println("a:"+a);
System.out.println("b:"+b);
System.out.println("------test()end------");
return 17;
}
public static void main(String[]args)
{
System.out.println("main start");
System.out.println("a:"+a);
System.out.println("b:"+b);
System.out.println("main end");
}
}