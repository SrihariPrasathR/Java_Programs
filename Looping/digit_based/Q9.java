package digit_based;

import java.util.Scanner;

public class Q9 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int max = 0;

        while (a != 0) {
            int d = a % 10;
            if (d > max)
                max = d;
            a = a / 10;
        }

        System.out.println(max);
    }
}
