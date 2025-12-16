package number_based_;

import java.util.Scanner;

public class Q5 {
     public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         int b=0;
    int a=sc.nextInt();
    while(a!=0){
        b=(b*10)+(a%10);
        a/=10;
    }
    System.out.println("Reverse of digits: "+b);
    }
}
