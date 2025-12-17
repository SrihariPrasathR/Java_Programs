package digit_based;

import java.util.Scanner;

public class Q15 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;

        while (a != 0) {
            b = b * 10 + a % 10;
            a = a / 10;
        }

        while (b != 0) {
            int d = b % 10;
            switch (d) {
                case 0: System.out.println("Zero"); break;
                case 1: System.out.println("One"); break;
                case 2: System.out.println("Two"); break;
                case 3: System.out.println("Three"); break;
                case 4: System.out.println("Four"); break;
                case 5: System.out.println("Five"); break;
                case 6: System.out.println("Six"); break;
                case 7: System.out.println("Seven"); break;
                case 8: System.out.println("Eight"); break;
                case 9: System.out.println("Nine"); break;
            }
            b = b / 10;
        }
    }
}
