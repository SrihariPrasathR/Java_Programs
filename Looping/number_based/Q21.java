package number_based_;

import java.util.Scanner;

public class Q21 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a <= 0) {
            System.out.println("Not Power of 3");
            return;
        }

        while (a % 3 == 0) {
            a = a / 3;
        }

        if (a == 1)
            System.out.println("Power of 3");
        else
            System.out.println("Not Power of 3");
    }
}
