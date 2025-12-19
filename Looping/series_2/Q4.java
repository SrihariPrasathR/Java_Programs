package series_2;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double sum=0;
        int p=1;
        for(int i=1;i<=10;i++){
            p=p*a;
            sum=sum+p/(double)i;
        }
        System.out.print(sum);
    }
}
