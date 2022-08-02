class Demo 
{
	public static void main(String[] args) 
	{
		Blackberry B=new Blackberry();
		B.Communication();
		System.out.println();
		Mobile M=B;
		M.Communication() ;
	}
}
