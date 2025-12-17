package digit_based;

import java.util.Scanner;

public class Q2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        while (a >= 10) {
            a = a / 10;
        }

        if (a % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
