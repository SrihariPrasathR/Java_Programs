package number_based_;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 7 == 0 || a % 10 == 7)
            System.out.println("Buzz Number");
        else
            System.out.println("Not Buzz Number");
    }
}
