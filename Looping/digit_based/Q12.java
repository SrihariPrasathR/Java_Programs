package digit_based;

import java.util.Scanner;

public class Q12 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int e = 0, o = 0;

        while (a != 0) {
            int d = a % 10;
            if (d % 2 == 0)
                e += d;
            else
                o += d;
            a = a / 10;
        }

        System.out.println(e - o);
    }
}
