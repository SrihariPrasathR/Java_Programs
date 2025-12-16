package number_based_;
import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=0,c=0;
        while(a!=0){
            b=a%10+b;
            a/=10;
        }
         while(b!=0){
            c=c+(b%10);
            b/=10;
        }
        if(c==1)
            System.out.println("Magic number");
    }
}
