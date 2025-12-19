package series_based;

import java.util.Scanner;

public class Q18 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int num = i;
            int sum = 0;

            while (num != 0) {
                int d = num % 10;
                int fact = 1;

                for (int j = 1; j <= d; j++) {
                    fact = fact * j;
                }

                sum = sum + fact;
                num = num / 10;
            }

            if (sum == i)
                System.out.print(i + " ");
        }
    }
}
