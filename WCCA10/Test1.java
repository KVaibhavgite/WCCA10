class Test1
{
public static void test(int a)
{
 a= a;

}
static int a;
public static void main(String[]args)
{
System.out.println(a); //0
test(56);
System.out.println(a);//56
test(134);
System.out.println(a);
}
}

