package number_based_;

import java.util.Scanner;

public class Q23 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = 1;
        int i = 1;

        while (i <= m) {
            p = p * n;
            i++;
        }

        System.out.println(p);
    }
}
