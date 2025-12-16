package number_based_;

import java.util.Scanner;

public class Q12 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1;
        int sum = 0;

        while (i <= a) {
            if (a % i == 0)
                sum = sum + i;
            i++;
        }

        System.out.println(sum);
    }
}
