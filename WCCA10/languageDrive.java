import java.util.Scanner;
class language
{
 static String language;
 static String developer;
 static int year;
 static
  {
  Scanner input=new Scanner(System.in);
  System.out.println("Enter the programming language");
  language=input.next();
  System.out.println("Enter the programming language developer name");
  developer=input.nextLine();
  System.out.println("Enter the year language develop");
  year=input.nextInt();
  }
}
class languageDrive
{
 public static void main(String[]args)
 {
 System.out.println("Language:"+language.language);
 System.out.println("Developer_name:"+language.developer);
 System.out.println("Year:"+language.year);
 }
}


