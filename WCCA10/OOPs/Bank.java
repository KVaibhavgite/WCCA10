class Bank
{
String name;
long acno;
double bal;
Bank(String name,long acno,double bal)
{
this.name=name;
this.acno=acno;
this.bal=bal;
}
void displayDetails()
{
System.out.println("Bank account holder name:-"+name);
System.out.println("Bank account number:-"+acno);
System.out.println("Bank account balance:-"+bal);
System.out.println("++++++++++++++++++++++++++++++++++++++++++");
}
void withdraw(double amount)
{
if(bal>=amount)
{
bal=bal-amount;
System.out.println("withdrawl successful");
}
else
{
System.out.println("insufficient amount");
System.out.println("bank account balance:-"+bal);
}
}
void deposit(double amount)
{
if(amount>0)
{
bal+=amount;
}
else
{
System.out.println("Be positive");
}
}
}