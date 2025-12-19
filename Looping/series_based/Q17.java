package series_based;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            int b = i;
            int d = 0;
            int count = 0;

            int e = i;
            while (e != 0) {
                e /= 10;
                count++;
            }

               
            while (b != 0) {
                int c = b % 10;
                int pow = 1;

                for (int j = 1; j <= count; j++) {
                    pow *= c;
                }

                d += pow;
                b /= 10;
            }

            if (d == i) {
                System.out.print( i+" ");
            }
        }
    }
}
