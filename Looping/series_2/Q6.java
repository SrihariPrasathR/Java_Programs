package series_2;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();

        if(ch==1){
            int x=2,sum=0;
            for(int i=1;i<=20;i++){
                if(i%2!=0)
                    sum=sum+(int)Math.pow(x,i);
                else
                    sum=sum-(int)Math.pow(x,i);
            }
            System.out.print(sum);
        }
        else{
            int n=0;
            for(int i=1;i<=4;i++){
                n=n*10+1;
                System.out.print(n+" ");
            }
        }
    }
}
