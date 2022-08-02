class String2 
{
	public static void main(String[] args) 
	{
		String s1="Hello";
		String s2="Hii";
        String s3=new String();
        String s4=new String(s1+" World");
		String s5=new String();
       // String s6=new String(byte[] s1);//error: '.class' expected 
        StringBuffer s7=new StringBuffer(s1+"APPA");
        StringBuilder s8=new StringBuilder(s1+"asd");
		System.out.println(s1);//Hello
		System.out.println(s2);//Hii
		System.out.println(s3);//
		System.out.println(s4);//Hello World
		System.out.println(s5);//
		//System.out.println(s6);// error: ';' expected
		System.out.println(s7);//HelloAPPA
		System.out.println(s8);//Helloasd
	}
}
