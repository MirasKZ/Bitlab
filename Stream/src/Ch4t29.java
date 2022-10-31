import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ch4t29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(in.nextInt());
        }
        int first = a.indexOf(0);
        int last = a.lastIndexOf(0);
        long sum = IntStream.range(first + 1, last)
                .map(i -> a.get(i))
                .reduce(0, (z, k) -> z + k);
        System.out.println(sum);
    }
}