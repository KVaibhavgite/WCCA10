class AccountDetailsDrive
{
public static void main(String[]args)
{
AccountDetail A1,A2;
A1=new AccountDetail();
A2=new AccountDetail();
A1.setDetails("Ram prasad sharma","SBI0003789",333444555,35000);
A2.setDetails("Allu Arjun","SBI0000007",888555221,1505035000);
A1.displayDetails();
A2.displayDetails();
}
}