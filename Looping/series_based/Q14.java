package series_based;

import java.util.Scanner;

public class Q14 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=0;
        int c=0;
        int a=sc.nextInt();
        
        int d=0;
        while(c!=a){
          
             b=sc.nextInt();
              if(b>0){
              d=d+b;
            c++;
           }
        }
        System.out.println(d);
        
    }
}
