class  Ram
{
	public static void main(String[] args) 
	{
		int  num=1234;
		int sum=0,rev=0;
		while(num!=0){
			rev=num%10;
			sum+=rev;
			num=num/10;
		}
		System.out.println(sum);
	}
}
