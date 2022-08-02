class Drive11
{
public static void main(String[]args)
{
AccountDetail A1,A2,A3;
A1=new AccountDetail();
A2=new AccountDetail();
A3=new AccountDetail();
A1.setDetails("Ram prasad sharma","SBI0003789",333444555,35000);
A2.setDetails("Allu Arjun","SBI0000007",888555221,1505035000);
A3.setDetails("Prabhas K.","SBI000058",318154148,505035000);
A1.displayDetails();
A2.displayDetails();
A3.displayDetails();
}
}