import java.util.Scanner;

public class PrimeNumber {

   static void print(int Num){
        int m=0,flag=0;
        m=Num/2;
        if(Num==0|| Num==1){
            System.out.println("not prime number");
        }else{
            for(int i=2;i<=m;i++){
                if(Num%i==0){
                    System.out.println("not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("prime number");
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to check");
        int Num = sc.nextInt();
        sc.close();
        print(Num);
    }

}