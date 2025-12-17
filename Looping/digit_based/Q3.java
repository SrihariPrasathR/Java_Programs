package digit_based;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int f = 0;

        while (a != 0) {
            if (a % 10 == d) {
                f = 1;
                break;
            }
            a = a / 10;
        }

        if (f == 1)
            System.out.println("Occurred");
        else
            System.out.println("Not Occurred");
    }
}
