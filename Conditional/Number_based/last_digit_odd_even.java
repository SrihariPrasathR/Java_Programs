import java.util.Scanner;

public class last_digit_odd_even {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=a%100;
        if((c%2)==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    
    }
}
