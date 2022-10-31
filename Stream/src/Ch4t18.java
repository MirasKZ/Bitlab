import java.util.Scanner;
import java.util.stream.IntStream;

public class Ch4t18 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.println(IntStream.of(a).max().getAsInt());
    }
}
