package scenario_based;

import java.util.Scanner;

public class Q18 {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=0;
        if(a<=1000)
            b=0;
           else if(a<=3000)
            b=(a-1000)/1000*5;
        else
            b=10+((a-3000)/1000)*10;
        System.out.println(b);
    }
}
