package digit_based;

import java.util.Scanner;

public class Q6 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int f = 1;

        while (a > 9) {
            if (a % 10 > (a / 10) % 10) {
                f = 0;
                break;
            }
            a = a / 10;
        }

        if (f == 1)
            System.out.println("Descending");
        else
            System.out.println("Not Descending");
    }
}
