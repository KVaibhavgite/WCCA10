class BookDrive
{
public static void main(String[]args)
{
Book b=new Book(011,"Chetan bhagat","Halfgirlfriend",300);
b.displayDetails();
Book b1=new Book(012,"Dr R S Aggarwal");
b1.displayDetails();
Book b2=new Book("Paulo Coelho","Alchemit");
b2.displayDetails();
System.out.println(b1.getprice());
b1.setprice(400);
b1.displayDetails();
}
}



