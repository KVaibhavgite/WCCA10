class shapeDriver
{
public static void main(String[]args)
{
shape[] sh=new shape[3];
sh[0]=new Circle(5);
sh[1]=new Triangle(2,6);
sh[2]=new Square(5);
for(int i=0;i<sh.length;i++)
{
sh[i].area();
}
}
}