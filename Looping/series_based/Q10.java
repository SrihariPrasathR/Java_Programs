package series_based;

import java.util.Scanner;

public class Q10 {
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=0;
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            System.out.print("Enter number: ");
            int c=sc.nextInt();
            b=b+c;
        }
        System.out.print(b);
    }
}
