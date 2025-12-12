import java.util.Scanner;

public class greatest_among_3 {
      public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Greatest is: "+(a>b?(a>c?a:c):(b>c?b:c)));
    }
}
