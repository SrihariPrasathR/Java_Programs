package digit_based;

import java.util.Scanner;

public class Q8 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i <= 9; i++) {
            int t = a, c = 0;
            while (t != 0) {
                if (t % 10 == i)
                    c++;
                t = t / 10;
            }
            if (c > 0)
                System.out.println(i + " : " + c);
        }
    }
}
