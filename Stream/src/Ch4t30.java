import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ch4t30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(in.nextInt());
        }
       long count=IntStream.range(1,a.size())
               .filter(i->a.get(i)>=0 && a.get(i-1)>=0 || a.get(i)<0 &&a.get(i-1)<0)
               .count();
        if(count>0) System.out.println("No");
        else System.out.println("Yes");
    }
}
