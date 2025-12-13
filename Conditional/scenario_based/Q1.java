package scenario_based;

import java.util.Scanner;

public class Q1 {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double bill=sc.nextDouble();
        if(bill>=5000)
        System.out.println(bill*0.8);
        else if(bill>=2000)
    System.out.println(bill*0.9);
    else if(bill>=1000)
             System.out.println(bill*0.95);
    else
    System.out.println(bill);
    }
}
