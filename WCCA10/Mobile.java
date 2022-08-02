class Mobile
{
String brand;
int ram;
int rom;
double price;
public void displayAttributes()
{
System.out.println("Brand:"+brand);
System.out.println("RAM:"+ram+"GB");
System.out.println("ROM:"+rom+"GB");
System.out.println("Price:"+price+"Rs");
System.out.println("====================");
}
public void setAttributes(String brand,int ram,int rom,double price)
{
this.brand=brand;
this.ram=ram;
this.rom=rom;
this.price=price;
}
}