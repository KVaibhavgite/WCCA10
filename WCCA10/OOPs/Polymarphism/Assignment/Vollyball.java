class Vollyball extends Ball
{
int radius;
String colour;
Vollyball(int radius,String colour)
{
this.radius=radius;
this.colour=colour;
}
public void purpose()
{
System.out.println("vollyball ball radius:"+radius);
System.out.println("vollyball ball colour:"+colour);
System.out.println("area:"+(Math.PI*4*radius*radius));
System.out.println("**********************************");
}
}
