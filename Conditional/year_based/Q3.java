package year_based;

import java.util.Scanner;

public class Q3 {
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        int first=year/100;
        int last=year%100;
        if(first==last)
            System.out.println("Equal");
        else
            System.out.println("Not equal");
    }
}
