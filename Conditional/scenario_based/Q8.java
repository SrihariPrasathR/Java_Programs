package scenario_based;

import java.util.Scanner;

public class Q8 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=1234;
        int b=sc.nextInt();
        if(a==b)
            System.out.println("Access Granted");
        else
            System.out.println("Access Denied");
    }
}
