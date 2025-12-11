package operators.formula;
import java.util.Scanner;
import java.util.*;
public class area_of_circle {
    public static void main(String[] args) throws Exception {
      Scanner sc=new Scanner(System.in);
      int r=sc.nextInt();
      
      double p=3.14;
      double g=p*r*r;
      System.out.println("Area of Circle: "+g);
     
    }
}