package character_based;

import java.util.Scanner;

public class Q4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        int b= (int) a;
        if(b>=48&&b<=57)
            System.out.println("Digit");
        
        else
            System.out.println("Not Digit");
    }
}
