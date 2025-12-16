package number_based_;

import java.util.Scanner;

public class Q13 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1;
        int f = 0;

        while (i * i <= a) {
            if (i * i == a) {
                f = 1;
                break;
            }
            i++;
        }

        if (f == 1)
            System.out.println("Perfect Square");
        else
            System.out.println("Not Perfect Square");
    }
}
