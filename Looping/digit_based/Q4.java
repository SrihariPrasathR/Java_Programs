package digit_based;

import java.util.Scanner;

public class Q4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int c = 0;

        while (a != 0) {
            if (a % 10 == d)
                c++;
            a = a / 10;
        }

        System.out.println(c);
    }
}
