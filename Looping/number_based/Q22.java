package number_based_;

import java.util.Scanner;

public class Q22 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul = 0;
        int i = 1;

        while (i <= b) {
            mul = mul + a;
            i++;
        }

        System.out.println(mul);
    }
}
