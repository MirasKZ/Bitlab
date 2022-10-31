import java.util.Scanner;
import java.util.stream.IntStream;

public class Ch4t14 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        long sum=IntStream.of(a).reduce(0,(z,b)->z+b);
        long count=IntStream.of(a).count();
        long ave=sum/count;
        IntStream.of(a).filter(i->i>ave).forEach(i-> System.out.print(i+" "));
        }
    }


