class Car
{
String model;
String type;
int price;
String colour;
Car (String model,String type,int price,String colour)
{
this.model=model;
this.type=type;
this.price=price;
this.colour=colour;
}
public void displayAttributes()
 {
 System.out.println("Model of Car:-"+model);
 System.out.println("Types of car:-"+type);
 System.out.println("price of car:-"+price+"Doller");
 System.out.println("colour of car:-"+colour);
 System.out.println("***********************************");
 }
 }

 class CarDrive
 {
 public static void main(String[]args)
 {
 Car c,c1;
 c=new Car("BMW","petrol",5000000,"Red");
 c1=new Car("TATA","petrol",250000,"Black");
 c.displayAttributes();
 c1.displayAttributes();
 }
 }