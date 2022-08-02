class BallDriver
{
public static void main(String[]args)
{
Ball[] b=new Ball[3];
b[0]=new Football(22,"white&black");
b[1]=new Tennies(6.7,"Green");
b[2]=new Vollyball(27,"Red&black");
for(int i=0;i<b.length;i++)
{
b[i].purpose();
}
}
}