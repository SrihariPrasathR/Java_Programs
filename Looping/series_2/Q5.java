package series_2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        double sum=0;
        int p=1,d=1;
        for(int i=1;i<=n;i++){
            p=p*x;
            if(i%2!=0)
                sum=sum+p/(double)d;
            else
                sum=sum-p/(double)d;
            d=d+2;
        }
        System.out.print(sum);
    }
}
