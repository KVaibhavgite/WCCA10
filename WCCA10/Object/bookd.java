class book
{
 int bid;
 double price;
 book(double price,int bid)
 {
 this.price=price;
 this.bid=bid;
 }
 public String tostring()
 {
 return"bookid"+bid+"Price"+price;
 }
 public boolean equal(Object o)
 {
 book b=(book)o;
 if(bid==b.bid && price==b.price)
 {
 return true;
 }
 else
 {
 return false;
 }
 }
 public int hashCode()
	{
	 int hc=0;
	 hc+=bid;
	 hc+=price;
	 return hc;
	}
}

 class bookd
 {
 public static void main(String[]args)
 {
 book b1=new book(150,4);
 book b2=new book(150,4);
 System.out.println(b1==b2);//book@4617c264
 System.out.println(b1.equal(b2));//true
 System.out.println("b1.hashcode():"+b1.hashCode());//b1.hashcode:154
 System.out.println("b2.hashcode():"+b2.hashCode());//b2.hashcode():154
 }
 }



