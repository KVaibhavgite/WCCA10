class Laptop
{
int ram;
int HD;
double price;
Laptop(int ram,int HD,double price)
{
this.ram=ram;
this.HD=HD;
this.price=price;
}
public static void main(String[]args)
{
Laptop l1=new Laptop(8,1,35000);
Laptop l2=new Laptop(8,1,35000);
Laptop l3=l1;
System.out.println("l1=l2:"+(l1=l2));//l1=l2:Laptop@452b3a41
System.out.println("l1=l3:"+(l1=l3));//l1=l3:Laptop@4a574795
System.out.println("l1.equal(l2)"+l1.equals(l2));//false
System.out.println("l1.equal(l3)"+l1.equals(l3));//true
}
}



