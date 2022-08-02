class Array2
{
public static int[] createArray(int n)
{
int [] arr=new int[n];
return arr;
}
public static void main(String[]args)
{
int [] arr=createArray(10);
System.out.println(arr.length);
}
}