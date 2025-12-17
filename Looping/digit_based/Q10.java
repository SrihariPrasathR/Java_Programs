package digit_based;

import java.util.Scanner;

public class Q10 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int min = 9;

        while (a != 0) {
            int d = a % 10;
            if (d < min)
                min = d;
            a = a / 10;
        }

        System.out.println(min);
    }
}
