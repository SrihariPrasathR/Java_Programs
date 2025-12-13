package scenario_based;

import java.util.Scanner;

public class Q7 {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int units=sc.nextInt();
        double bill=0;
        if(units<=100)
            bill=0;
        else if(units<=300)
            bill=(units-100)*5;
     else
            bill=(200*5)+((units-300)*10);
        if(units>500)
            bill=bill*1.1;
        System.out.println(bill);
    }
}
