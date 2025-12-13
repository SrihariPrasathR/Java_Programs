package scenario_based;

import java.util.Scanner;

public class Q13 {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>90)
            System.out.println("Full");
        else if(a>50)
            System.out.println("Moderate");
        else
            System.out.println("Low");
    }
}
