import java.util.Scanner;
class Driver
{
public static void main(String[]args)
{
Scanner ab=new Scanner(System.in);
System.out.println("Enter the smaller number is :-");
int n1=ab.nextInt();
System.out.println("Enter the largest number is :-");
int n2=ab.nextInt();
Even.printEven(n1,n2);
}
}