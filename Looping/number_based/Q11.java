package number_based_;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1;

        while (i <= a) {
            if (a % i == 0)
                System.out.println(i);
            i++;
        }
    }
}

