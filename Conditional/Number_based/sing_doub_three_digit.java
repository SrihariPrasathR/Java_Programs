import java.util.Scanner;

public class sing_doub_three_digit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=0;
        while(a!=0){
            a/=10;
            c++;
        }
if(c==1)
    System.out.println("Single digit");
else if(c==2)
    System.out.println("Double digit");
else
    System.out.println("Three digit");
    
    }
}
