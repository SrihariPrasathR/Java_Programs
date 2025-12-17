package patterns;

public class Q10 {
     public static void main(String[] args) {
        int n=5;
     
        for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
                if(i<j&&(i==0||j==i+1))
                         System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for(int j=0;j<n;j++){
                if(i+j<=n-1&&(i+j==n-1||i==0))
                        System.out.print("* ");
                else
                    System.out.print("  ");
            }
            
           
         
            System.out.println();
        }
        
    }
}
