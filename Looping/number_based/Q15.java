package number_based_;

import java.util.Scanner;

public class Q15 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=0;
        for(int i=1;i<a;i++){
           if(a%i==0)
            b+=i;
        }
        if(a==b)
            System.out.println("Perfect number");
        else
            System.out.println("Not perfect");

     
    }
}
