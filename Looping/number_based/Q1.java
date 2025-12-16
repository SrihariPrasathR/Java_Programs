package number_based_;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         int b=1;
    int a=sc.nextInt();
    for(int i=1;i<=a;i++){
        b=b*i;
    }
    System.out.println("Factorial: "+b);
    }
   

}
