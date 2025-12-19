package series_based;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=0;
        int a=sc.nextInt();
        while(a>0){
           
            b=b+a;
             a=sc.nextInt();
        }
        System.out.println(b);
        
    }
}
