package number_based_;

import java.util.Scanner;

public class Q8 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = a;
        int y = b;

        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }

        int gcd = a;
        int lcm = (x * y) / gcd;

        System.out.println(lcm);
    }
}
