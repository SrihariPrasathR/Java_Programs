package digit_based;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int e = 0, o = 0;

        while (a != 0) {
            if ((a % 10) % 2 == 0)
                e++;
            else
                o++;
            a = a / 10;
        }

        if (e > 0 && o == 0)
            System.out.println("All Even");
        else if (o > 0 && e == 0)
            System.out.println("All Odd");
        else
            System.out.println("Mixed");
    }
}
