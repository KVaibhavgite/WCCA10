class Driver3
{
public static void main(String[]args)
{
SavingsAccount1 a=new SavingsAccount1();
LoanAccount1 a1=new LoanAccount1();
 /*   a.balance=12500;
    a.name="name";
	a.acno=1452663;
	a.ifse="sbin12";

a1.amount=125000;
a1.emi=12000;
a1.interest=5000;
a1.name="manga";
a1.acno=12365478;
a1.ifse="SBIN0143";*/
	a.setDetails("name","sbin143",143625,1234545);
	 a.displayDetails();
	a1.setDetail(12000,5000,102354,"ram","sbin123",142563);
	a1.displayDetail();
}
}