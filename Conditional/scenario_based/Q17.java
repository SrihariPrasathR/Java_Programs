package scenario_based;

import java.util.Scanner;

public class Q17 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=1 && a<=5)
               System.out.println("price is 100 Weekday");
        else if(a==6 || a==7)
            System.out.println("price is 200 for Weekend");
        else
            System.out.println("Invalid");
    }
}
