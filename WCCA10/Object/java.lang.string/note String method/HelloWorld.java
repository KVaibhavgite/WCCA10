import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            if(i%9!=0 && i%13!=0){
                //System.out.println(i);
                continue;
            }
            if(i/9==0){
                System.out.print("Foo");
            }
            if(i%13==0){
                System.out.print("Bar");
            }
           // System.out.println();
		   
        }
    }
}

