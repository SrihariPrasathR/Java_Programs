
import java.util.Scanner;

public class Q5 {
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter balance:");
        double balance=sc.nextDouble();
        System.out.println("Enter choice:");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                double w=sc.nextDouble();
                System.out.println("Enter amount");
                if(w<=balance){
                    balance-=w;
                    System.out.println(balance);
                } else
                    System.out.println("Insufficient");
                break;
            case 2:
                System.out.println("Enter money to add: ");
                double d=sc.nextDouble();
                balance+=d;
                System.out.println(balance);
                break;
            case 3:
                System.out.println(balance);
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
