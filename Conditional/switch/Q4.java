

import java.util.Scanner;
public class Q4 {
    
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch(a){
            case 10:
            case 11:
            case 12:
                System.out.println("Winter");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Spring");
                break;
            case 1:
            case 2:
            case 3:
                System.out.println("Summer");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
