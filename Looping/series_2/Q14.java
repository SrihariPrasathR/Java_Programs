package series_2;

public class Q14 {
    public static void main(String[] args) {
        double sum=0;
        for(int i=1;i<=19;i++){
            sum=sum+(i/(double)(i+1));
        }
        System.out.print(sum);
    }
}
