package series_based;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int e=0,b=1,c=0;
     
        System.out.print(e+" "+b+" ");
        while(c<a){
            c=e+b;
            e=b;
            b=c;
            System.out.print(c+" ");
          

        }
        
    }
}
