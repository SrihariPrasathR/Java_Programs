package number_based_;

import java.util.Scanner;

public class Q14 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int num = a;
        int sum = 0;

        while (a != 0) {
            int d = a % 10;
            int f = 1;
            int i = 1;

            while (i <= d) {
                f = f * i;
                i++;
            }

            sum = sum + f;
            a = a / 10;
        }

        if (sum == num)
            System.out.println("Strong Number");
        else
            System.out.println("Not Strong Number");
    }
}
