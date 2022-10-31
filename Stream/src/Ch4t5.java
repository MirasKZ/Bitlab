import java.util.Scanner;
import java.util.stream.IntStream;

public class Ch4t5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        IntStream.of(a)
                .forEach(num->System.out.print(num*num+" "));
    }
}
