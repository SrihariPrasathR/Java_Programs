package character_based;

import java.util.Scanner;

public class Q3 {
   public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char a=sc.next().toLowerCase().charAt(0);
        int b= (int) a;
        if(b>=97&&b<=122)
            System.out.println("Alphabet");
        
        else
            System.out.println("Not alphabet");
    }
}
