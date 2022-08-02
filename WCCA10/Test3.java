class Test3
{
public static void test(int b)
{
a=b;
}
static int a;
}

class TestDriver
{
public static void main(String[]args)
{
Test.a=25;
System.out.println(Test.a);
Test.a=35;
System.out.println(Test.a);
}
}