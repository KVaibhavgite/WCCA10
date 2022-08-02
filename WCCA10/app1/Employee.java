class Employee
{
String ename;
int eid;
double sal;
String dignt;
Employee(int eid)
{
this.eid=eid;
}
Employee(String ename,int eid)
{
	this(eid);
this.ename=ename;
}
Employee(int eid,String dignt)
{
this(eid);
this.dignt=dignt;
}
Employee(String ename,int eid,double sal,String dignt)
{
this(ename,eid);
this.sal=sal;
this.dignt=dignt;
}
void displayAttributes()
	{
	System.out.println("Employee name:-"+ename);
	System.out.println("Employee id:-"+eid);
	System.out.println("Employee salary:-"+sal+"-Rs");
	System.out.println("Employee designatin:-"+dignt);
	System.out.println("-:**************************************:-");
}
}
