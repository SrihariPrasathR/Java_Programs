package scenario_based;

import java.util.Scanner;

public class Q12 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<10)
            System.out.println("Cold");
        else if(a<25)
            System.out.println("Pleasant");
        else if(a<35)
            System.out.println("Hot");
        else
            System.out.println("Heatwave");
    }
}
