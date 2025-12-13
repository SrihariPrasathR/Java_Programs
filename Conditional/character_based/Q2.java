package character_based;

import java.util.Scanner;

public class Q2 {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        int b= (int) a;
        if(b>=48&&b<=57)
            System.out.println("number");
        else if(b>=65&&b<=90)
            System.out.println("Uppercase alphabets");
        else if(b>=97&&b<=122)
            System.out.println("Lowercase");
        else
            System.out.println("Special character");
    }
}
