

public class Q2 {
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks>=80)
            System.out.println("A");
        else if(marks>=60)
            System.out.println("B");
        else if(marks>=40)
            System.out.println("Java");
        else
            System.out.println("Fail");
    }
}
