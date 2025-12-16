package number_based_;

import java.util.Scanner;

public class Q2 {
     public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         int b=0;
    int a=sc.nextInt();
    while(a!=0){
        b=b+(a%10);
        a/=10;
    }
    System.out.println("Sum of digits: "+b);
    }
}
