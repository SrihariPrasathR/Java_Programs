
package scenario_based;
import java.util.Scanner;

public class Q10 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String color=sc.next().toLowerCase();
        if(color.equals("red"))
            System.out.println("stop");
        else if(color.equals("yellow"))
            System.out.println("ready");
        else if(color.equals("green"))
            System.out.println("go");
        else
            System.out.println("Invalid");
    }
}
