class Account
{
long acno;
String na;
String ifsc;
double bal;
Account(long acno,String na,String ifsc,double bal)
{
this.acno=acno;
this.na=na;
this.ifsc=ifsc;
this.bal=bal;
System.out.println("Account number:-"+acno);
System.out.println("Account holder name :-"+na);
System.out.println("Account ifsc code:-"+ifsc);
System.out.println("Account balance :-"+ bal);
System.out.println("**********************************");

}
Account(long acno,String na)
{
this.acno=acno;
this.na=na;
System.out.println("Account number:-"+acno);
System.out.println("Account holder name :-"+na);
System.out.println("**********************************");

}
Account()
{
System.out.println("From Account()");
System.out.println("**********************************");

}
Account(long acno)
{
this.acno=acno;
System.out.println("Account number:-" +acno);
System.out.println("**********************************");

}
}
class AccountDrive
{
public static void main(String[]args)
{
Account a=new Account();
Account a1=new Account(123456789);
Account a2=new Account(234567891,"Dinga");
Account a3=new Account(345678912,"manga","sbin0002324",25000.0);
}
}