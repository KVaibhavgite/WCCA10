class LaptopDrive
{
public static void main(String[]args)
{
Laptop l=new Laptop(4,1,12,25000.0);
l.displayAttributes();
System.out.println(l.getram());
l.setram(8);
l.displayAttributes();
System.out.println(l.gethard_disk());
System.out.println(l.getproduct_id());
System.out.println(l.getprice());
l.setprice(35000.0);
l.displayAttributes();
}
}