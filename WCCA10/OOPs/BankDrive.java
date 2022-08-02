class BankDrive
{
public static void main(String[]args)
{
Bank b1=new Bank("xyz",1234567891,1000);
b1.displayDetails();
b1.deposit(200);
b1.displayDetails();
b1.withdraw(1500);
b1.displayDetails();
}
}