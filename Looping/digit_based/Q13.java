package digit_based;

import java.util.Scanner;

public class Q13 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r = 0, p = 1;

        while (a != 0) {
            int d = a % 10;
            if (d != 0) {
                r = r + d * p;
                p = p * 10;
            }
            a = a / 10;
        }

        System.out.println(r);
    }
}
