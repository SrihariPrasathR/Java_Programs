package character_ascii;

import java.util.Scanner;

public class Q7 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c0 = 0, c1 = 0;

        while (a != 0) {
            int d = a % 10;
            if (d == 0)
                c0++;
            else if (d == 1)
                c1++;
            a = a / 10;
        }

        System.out.println("0s = " + c0);
        System.out.println("1s = " + c1);
    }
}
