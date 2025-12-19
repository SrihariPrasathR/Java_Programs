package series_based;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=0;
        int c=0;
        int a=sc.nextInt();
        int i=3;
        while(c!=a){
            b=0;
            for(int j=2;j<i;j++){
                if(i%j==0)
                    b=1;  
             }
        if(b==0){
        System.out.print(i+" ");
     c++;   
    }
 i++;
}
        
    }
}
