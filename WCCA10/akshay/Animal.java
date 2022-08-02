class Animal 
{
	public static void main(String[] args) 
	{
		Husky H=new Husky();
		H.Bark();
		System.out.println();
		Dog D=H;
		D.Bark();
	}
}
