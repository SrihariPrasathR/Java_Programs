package scenario_based;

import java.util.Scanner;

public class Q11 {
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=10000)
            System.out.println("20% discount"+a*0.8);
        else if(a>=1000)
            System.out.println("10% discount"+a*0.9);
        else
            System.out.println(a);
    }
}
