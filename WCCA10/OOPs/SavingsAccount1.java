class SavingsAccount1 extends Account1
{
double balance;
SavingsAccount1(){}
SavingsAccount1(double balance,String name,long acno,String ifse)
{
    this.balance=balance;
    this.name=name;
	this.acno=acno;
	this.ifse=ifse;
}
public void displayDetails()
{
System.out.println("Account Holder Name:-"+name);
System.out.println("IFSE Code:-"+ifse);
System.out.println("Account number:-"+acno);
System.out.println("Account Balance:-"+balance+"Rs");
System.out.println("*************************************");
}
public void setDetails(String n,String i,int a,double b)
{
 name=n;
 ifse=i;
 acno=a;
 balance=b;
}
}