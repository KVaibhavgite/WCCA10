import java.util.Scanner;
class book
{
static String title;
static String author;
static double price;
static
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the book title");
title=input.next();
System.out.println("Enter the book author");
author=input.next();
System.out.println("Enter the book price");
price=input.nextDouble();
}
}
class BookDrive
{
public static void main(String[]args)
{
System.out.println("Title:"+book.title);
System.out.println("Author:"+book.author);
System.out.println("Price:"+book.price);
}
}


