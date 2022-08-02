import java.util.Scanner;
class Largest
{
public static void main(String[]args)
{
Scanner sh=new Scanner(System.in);
System.out.println("Enter the first number");
int n1=sh.nextInt();
System.out.println("Enter the second number");
int n2=sh.nextInt();
System.out.println("Enter the third number");
int n3=sh.nextInt();
System.out.print("the largest number is:-"+largestOfThree(n1,n2,n3));
}
public static int largestOfThree(int a,int b,int c)
{
int largestOfThree=(a>b&&a>c)?a:(b>c)?b:c;
return largestOfThree;
}
}