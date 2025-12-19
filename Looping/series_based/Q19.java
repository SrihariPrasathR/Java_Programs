package series_based;

import java.util.Scanner;

public class Q19 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=0;
        for(int j=1;j<a;j++){
            b=0;
        for(int i=1;i<j;i++){
           if(j%i==0)
            b+=i;
        }
        if(j==b)
            System.out.print(j+" ");
       

    }
    }
}
