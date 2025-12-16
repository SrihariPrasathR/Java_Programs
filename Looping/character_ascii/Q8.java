package character_ascii;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        int p = 1;

        while (a != 0) {
            int r = a % 2;
            b = b + r * p;
            p = p * 10;
            a = a / 2;
        }

        System.out.println(b);
    }
}
