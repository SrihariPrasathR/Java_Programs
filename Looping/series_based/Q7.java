package series_based;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=0,i=1;
        while(b!=a){
            if(i%2!=0){
            System.out.print(i+" ");
           b++;
            }
           i++;
        }
    }
}
