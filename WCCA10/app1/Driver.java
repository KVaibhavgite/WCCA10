class a
{
static void m1()
{
System.out.println("from a");
}
}
class b extends a
{
static void m1()
{
System.out.println("from b");
}
}
class Driver
{
public static void main(String[]args)
{
b a2=new b();
try{
	b a1=(b)new a();
	
}
catch(Exception e)
	{
		System.out.println("chvfeb");
	}
	finally{
		a2.m1();
	}

}
}