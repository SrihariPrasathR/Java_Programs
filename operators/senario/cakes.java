
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Cake per hr:");
         
       int a=sc.nextInt();
       System.out.println("Enter hr: ");
       int b=sc.nextInt();
       System.out.println("Number of cakes made: "+(a*b));
        
    }
}
