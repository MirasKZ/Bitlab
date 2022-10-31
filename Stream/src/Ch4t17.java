import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ch4t17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(in.nextInt());
        }
        long product=IntStream.range(0,a.size())
                .filter(i->i%2==0)
                .filter(i->a.get(i)!=0)
                .map(i->a.get(i))
                .reduce(1,(z,k)->z*k);
        System.out.println(product);
    }
}
