package character_ascii;

import java.util.Scanner;

public class Q9 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = 0;
        int p = 1;

        while (a != 0) {
            int r = a % 10;
            d = d + r * p;
            p = p * 2;
            a = a / 10;
        }

        System.out.println(d);
    }
}
