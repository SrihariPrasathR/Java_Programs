package scenario_based;

import java.util.Scanner;

public class Q16 {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        if(a>=10)
            System.out.println("Valid Number");
        else
            System.out.println("Invalid Number");
    }
}
