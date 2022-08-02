import java.util.Scanner;
class CalsiDrive
{
public static void main(String[]args)
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the 1st for Addition" );
System.out.println("Enter the 2nd for Subtraction" );
System.out.println("Enter the 3rd for Multiplicatin" );
System.out.println("Enter the 4th for Division" );
System.out.println("Enter the your choise" );
int choice=input.nextInt();
switch(choice)
{
case 1 :
{
System.out.println("Enter the 1st num");
int num1=input.nextInt();
System.out.println("Enter the 2nd num");
int num2=input.nextInt();
System.out.println(num1+"+"+num2+"="+Calsi.add(num1,num2));
System.out.println("============Thank you performing task===========");
break;
}
case 2 :
{
System.out.println("Enter the 1st num");
int num1=input.nextInt();
System.out.println("Enter the 2nd num");
int num2=input.nextInt();
System.out.println(num1+"-"+num2+"="+Calsi.sub(num1,num2));
System.out.println("============Thank you performing task===========");
break;
}
case 3 :
{
System.out.println("Enter the 1st num");
int num1=input.nextInt();
System.out.println("Enter the 2nd num");
int num2=input.nextInt();
System.out.println(num1+"*"+num2+"="+Calsi.prod(num1,num2));
System.out.println("============Thank you performing task===========");
break;
}
case 4 :
{
System.out.println("Enter the 1st num");
int num1=input.nextInt();
System.out.println("Enter the 2nd num");
int num2=input.nextInt();
System.out.println(num1+"/"+num2+"="+Calsi.div(num1,num2));
System.out.println("============Thank you performing task===========");
break;
}
default :
{
System.out.println("you are choose worng choise");
System.out.println("============Thank you performing task===========");//vaibhavgite
}
}
}
}