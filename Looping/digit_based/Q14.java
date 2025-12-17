package digit_based;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int s = 0, cb = 0;

        while (a != 0) {
            int d = a % 10;
            s += d * d;
            cb += d * d * d;
            a = a / 10;
        }

        System.out.println("Sum of Squares = " + s);
        System.out.println("Sum of Cubes = " + cb);
    }
}
