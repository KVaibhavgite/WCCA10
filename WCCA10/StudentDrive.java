class Student
{
String name;
int id;
int age;
Student()
	{
	}
Student(String name)
{
this.name=name;
}
Student (int id,int age)
{
this.id=id;
this.age=age;
}
Student( String name,int id,int age)
{
this.name=name;
this.id=id;
this.age=age;
}
void DislpayDetails()
{
System.out.println("Student Name:-"+name);
System.out.println("Student id:-"+id);
System.out.println("Student age:-"+age);
System.out.println("__________________________________________");
}
}

class StudentDrive
{
public static void main(String[]args)
{
Student s,s1,s2,s3;
s=new Student();
s1=new Student("Dinga");
s2=new Student(112,14);
s3=new Student("Dingi",113,13);
  s.DislpayDetails();
  s1.DislpayDetails();
   s2.DislpayDetails();
   s3.DislpayDetails();
  
}
}