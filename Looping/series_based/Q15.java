package series_based;

import java.util.Scanner;

public class Q15 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=0;
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            b=0;
            for(int j=2;j<a/2;j++){
                if(i%j==0)
                    b=1;
            
               
        
        }
        if(b==0)
        System.out.print(i+" ");
        }
        
    }
}
