package scenario_based;

import java.util.Scanner;

public class Q15 {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>100)
            System.out.println("High Speed");
        else
            System.out.println("Normal Speed");
    }
}
