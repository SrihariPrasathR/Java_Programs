package scenario_based;

import java.util.Scanner;

public class Q20 {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>100)
            System.out.println("Over-speeding! Fine imposed.");
        else
    System.out.println("Speed is within limit");
    }
}
