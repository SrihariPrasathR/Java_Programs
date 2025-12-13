package year_based;

import java.util.Scanner;

public class Q4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int y1=sc.nextInt();
        int y2=sc.nextInt();
        if((y1%10)==(y2%10))
            System.out.println("Same");
        else
            System.out.println("Not same");
    }
}
