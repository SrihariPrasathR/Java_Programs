package patterns;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        int n=5;
     
        for(int i=0;i<n;i++){
       
            for(int j=0;j<n;j++){
                if(i+j>=n-1&&(i+j==n-1||i==n-1))
                        System.out.print("* ");
                else
                    System.out.print("  ");
            }
            
            for(int j=0;j<n;j++){
          
                if(i>j&&(i==n-1||i==j+1))
                         System.out.print("* ");
                else
                    System.out.print("  ");
            }
         
            System.out.println();
        }
        
    }
}