package patterns;

public class Q25 {
    public static void main(String[] args) {
        int n=5;
     int k;
     char c;
        for(int i=0;i<n;i++){
            k=1;
            c='A';
        for(int j=0;j<n;j++){
                if(i<j)
                         System.out.print(c++ +" ");
                else
                    System.out.print("  ");
            }
            
            for(int j=0;j<n;j++){
                if(i+j<=n-1)
                        System.out.print(c-- +" ");
                else
                    System.out.print("  ");
            }
            
           
         
            System.out.println();
        }
        
    }
}
