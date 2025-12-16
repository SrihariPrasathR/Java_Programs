package number_based_;

import java.util.Scanner;

public class Q4 {
     public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         int b=1;
    int a=sc.nextInt();
    while(a!=0){
        b=b*(a%10);
        a/=10;
    }
    System.out.println("Product of digits: "+b);
    }
}
