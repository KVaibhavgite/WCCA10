class Circle extends shape
{
int radius;
Circle(int radius)
{
this.radius=radius;
}
public void area()
{
System.out.println("area:"+Math.PI*radius*radius);
}
}