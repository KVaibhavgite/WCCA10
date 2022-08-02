class Simcard
{
String sp;
long cn;
Simcard(String sp,long cn)
{
this.sp=sp;
this.cn=cn;
}
void display()
{
System.out.println("Service provider:"+sp);
System.out.println("custemer contact number:"+cn);
}
}