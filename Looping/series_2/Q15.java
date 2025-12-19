package series_2;

public class Q15 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=10;i++){
            if(i%2!=0)
                sum=sum+(i*2);
            else
                sum=sum-(i*2);
        }
        System.out.print(sum);
    }
}
