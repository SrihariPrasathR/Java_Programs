package series_based;

import java.util.Scanner;

public class Q24 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int p = 1;
        while (p <= n) {
            System.out.print(p + " ");
            p = p * 2;
        }
    }
}
