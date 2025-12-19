package series_based;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=0,c=0;
        for(int i=1;i<=a;i++){
            if(i%2!=0)
            b=b+i;
        else
            c=c+i;
        }
        System.out.println("Odd Sum:"+b+" ");
        System.out.println("Even Sum:"+c+" ");
    }
}
