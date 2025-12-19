package series_2;

public class Q13 {
    public static void main(String[] args) {
        double sum=0;
        for(int i=1;i<=19;i+=2){
            sum=sum+1.0/i;
        }
        System.out.print(sum);
    }
}
