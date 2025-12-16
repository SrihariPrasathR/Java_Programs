package number_based_;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=0,c=a;
        while(a!=0){
            b=b+(a%10);
            a/=10;
        }
        if(c%b==0)
            System.out.println("Harshad");
    }
}
