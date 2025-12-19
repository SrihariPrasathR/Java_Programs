package series_based;

import java.util.Scanner;

public class Q3 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            if(i%2!=0)
            System.out.print(i+" ");
        }
    }
}
