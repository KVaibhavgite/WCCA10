class Array3
{
public static void main(String[]args)
{
int[] arr={10,20,30,40,50,60};
int[] brr={1,2,3,4,5,6};
printNumber(arr);
printNumber(brr);
}
public static void printNumber(int[] arr)
{
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
}
}