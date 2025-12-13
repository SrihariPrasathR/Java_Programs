package scenario_based;
import java.util.Scanner;

public class Q14 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<12)
            System.out.println("Ticket price is 50 Child");
        else if(a<60)
            System.out.println("Ticket price is 100 Adult");
    else
            System.out.println("Ticket price is 80 Senior");
    }
}