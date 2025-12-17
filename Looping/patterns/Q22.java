package patterns;

public class Q22 {
  public static void main(String[] args) {
        
    
    int n=5;
     int k=1;
        for(int i=0;i<n;i++){
         
            for(int j=0;j<n;j++){
                if(j<=i)
                        System.out.print(k++ +" ");
              
            }
            
           
         
            System.out.println();
        }
}}
