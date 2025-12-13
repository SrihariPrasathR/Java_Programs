package scenario_based;

import java.util.Scanner;

public class Q19 {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<20)
            System.out.println("low Data");
         else if(a==100)
            System.out.println("data Over");
        else if(a>50)
            System.out.println("above half left consumed");
        else if(a<=50)
            System.out.println("half Consumed");
           
    }
}
