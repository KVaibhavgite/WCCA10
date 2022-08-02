class Laptop1
{
String brand;
int ram;
int hd;
double price;
public void displayAttributes()
{
System.out.println("Brand:-"+brand);
System.out.println("RAM:-"+ram);
System.out.println("Harddisk:-"+hd);
System.out.println("Price:-"+price);
System.out.println("-:******************************:-");
}
public void setAttributes(String brand,int ram,int hd,double price)
{
this.brand=brand;
this.ram=ram;
this.hd=hd;
this.price=price;
}
}


