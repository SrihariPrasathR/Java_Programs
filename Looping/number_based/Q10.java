package number_based_;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         int b=1;
    int a=sc.nextInt();
   for(int i=2;i<a/2;i++){
    if(a%i==0)
        b=0;
   }
    if(b==0)
    System.out.println("not Prime");
else
    System.out.println(" prime");
    }
}
