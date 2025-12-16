package character_ascii;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);

        char ch = a;

        while (ch <= b) {
            System.out.println(ch);
            ch++;
        }
    }
}
