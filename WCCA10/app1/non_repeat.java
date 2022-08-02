import java.util.Scanner;

public class non_repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:- ");
		String value=sc.nextLine();
		String sub[]=new String[value.length() * value.length()];
		int count=0;
	     //System.out.println(value.length());
		for(int i=0;i<value.length();i++)
		{
			for(int j=i+1;j<=value.length();j++)
			{
				sub[count]=value.substring(i,j);
				count++;
			}
		}
		int max=0;
		String solution="";
		for(int i=0;i<count;i++)
		{
			String original=sub[i];
			//System.out.println("answer is  original:- "+original);
			String dup="";
			//System.out.println("answer is dup :- "+dup);
			for(int j=original.length()-i;j>=0;j--)
			{
				dup=dup+original.charAt(j);	
				//System.out.println("answer is  original dup:- "+dup);
			}
		
			if(original.equals(dup))
			{
				if(max<original.length())
				{
					solution=original;
					max=original.length();
				}
				
			}
			
		}
		
		System.out.println("answer is :- "+solution);

	}

}
