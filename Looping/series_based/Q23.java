package series_based;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=0,c=0,a;
        for(int i=0;i<n;i++){
            b=0;
            c=0;
            a=i;
        while(a!=0){
            b=a%10+b;
            a/=10;
        }
         while(b!=0){
            c=c+(b%10);
            b/=10;
        }
        if(c==1)
            System.out.print(i+" ");
    }}
}
