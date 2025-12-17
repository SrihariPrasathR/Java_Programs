package patterns;

public class Q24 {
     public static void main(String[] args) {
        int n=5;
     int k;
        for(int i=0;i<n;i++){
        k=1;
            for(int j=0;j<n;j++){
                if(i+j>=n-1)
                        System.out.print(k++ +" ");
                else
                    System.out.print("  ");
            }
            k--;
            for(int j=0;j<n;j++){
          
                if(i>j)
                         System.out.print(--k+ " ");
                else
                    System.out.print("  ");
            }
         
            System.out.println();
        }
        
    }
}
