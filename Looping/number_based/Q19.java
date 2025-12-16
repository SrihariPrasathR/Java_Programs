package number_based_;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int original=a;
        int b=a*a;
        int d,c=1;
        int count=0;
        while(a!=0){
            count++;
            a/=10;
        }
        for(int i=0;i<count;i++)
            c=c*10;

        if((b%c)==original)
            System.out.println("Automorphic");
       
    }
}
