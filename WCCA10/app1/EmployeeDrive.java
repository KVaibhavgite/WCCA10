class EmployeeDrive
{
public static void main(String[]args)
{
Employee e=new Employee(101);
Employee e1=new Employee("abc",102);
Employee e2=new Employee(103,"manager");
Employee e3=new Employee("qwe",104,12000,"Research");
e.displayAttributes();
e1.displayAttributes();
e2.displayAttributes();
e3.displayAttributes();
}
}