package geometry_based;

import java.util.Scanner;

public class Q2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int x=a*a, y=b*b, z=c*c;
        if(x+y==z || x+z==y || y+z==x)
            System.out.println("Right angled");
        else
            System.out.println("Not right angled");
    }
}
