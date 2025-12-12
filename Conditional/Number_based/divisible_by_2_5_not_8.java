import java.util.Scanner;

public class divisible_by_2_5_not_8 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0&& a%5==0 && a%8!=0)
            System.out.println("Divisible by 2 and 5 and not 8");
       
        else
            System.out.println("Not divisible");
    
    }
}
