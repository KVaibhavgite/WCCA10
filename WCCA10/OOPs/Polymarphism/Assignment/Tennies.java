class Tennies extends Ball
{
double radius;
String colour;
Tennies(double radius,String colour)
{
this.radius=radius;
this.colour=colour;
}
public void purpose()
{
System.out.println("football ball radius:"+radius);
System.out.println("football ball colour:"+colour);
System.out.println("area:"+(Math.PI*4*radius*radius));
System.out.println("**********************************");
}
}
