
import java.util.Scanner;
public class Q2 {
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch(a/10){
            case 10:
            case 9:
            case 8:
                System.out.println("A");
                break;
            case 7:
            case 6:
                System.out.println("B");
                break;
            case 5:
            case 4:
                System.out.println("Java");
                break;
            default:
                System.out.println("Fail");
        }
    }
}
