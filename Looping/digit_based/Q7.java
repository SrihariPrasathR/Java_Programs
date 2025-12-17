package digit_based;

import java.util.Scanner;

public class Q7 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int num = a;
        int last = a % 10;
        int p = 1;

        while (a >= 10) {
            a = a / 10;
            p = p * 10;
        }

        int first = a;
        int mid = num % p / 10;

        int res = last * p + mid * 10 + first;
        System.out.println(res);
    }
}
