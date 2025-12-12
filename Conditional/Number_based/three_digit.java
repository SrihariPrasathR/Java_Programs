import java.util.*;
public class three_digit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=0;
        while(a!=0){
              a/=10;
              c++;
        }
        if(c==3)
            System.out.println("It is 3 digit number");
        else
            System.out.println("it is not a 3 digit number");
    }
}
