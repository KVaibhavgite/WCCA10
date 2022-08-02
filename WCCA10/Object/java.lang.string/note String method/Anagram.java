import java.util.Scanner;
class Anagram 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your input : ");
		String str = sc.nextLine();
		
		
		String [] array = str.split(" ",0);
		String str01= array[0];
		String str02= array[1];
		for(int i=0;i<str01.length();i++){
			String ch=str01.indexOf(i);
			if(ch.contains(str02)){
			System.out.println("1");
		}else{
			System.out.println("0");
		}
			
		}
		/*if(array[0].equals(array[1]))
			{
			System.out.println("1");
		}else{
			System.out.println("0");
		}*/
		System.out.println(array[0]);
		System.out.println(array[1]);
	}
}
