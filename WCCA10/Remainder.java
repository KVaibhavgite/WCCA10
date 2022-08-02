import java.util.Scanner;
class Remainder
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the 1st num");
int n1=sc.nextInt();
System.out.println("enter the 2nd num");
int n2=sc.nextInt();
int sum= mol(n1,n2);
System.out.println(n1+"%"+n2+"="+sum);
}
public static int mol (int a,int b)
{
int sum=a%b;
return sum; 
}
}
