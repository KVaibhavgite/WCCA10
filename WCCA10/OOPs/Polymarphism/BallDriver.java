class BallDriver
{
public static void main(String[]args)
{
Ball[] a=new Ball[4];
a[0]= new Ball();
a[1]= new Football(2);
a[2]= new Volleyball(3);
a[3]= new Tenniesball(4);
for(int i=0;i<a.length;i++)
{
a[i].purpose();
}
}
}
