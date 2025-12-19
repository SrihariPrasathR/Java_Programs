package series_2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double sum=0;
        for(int i=1;i<=10;i++){
            sum=sum+(a*a)/(double)i;
        }
        System.out.print(sum);
    }
}
