import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class Ch4t4 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(in.nextInt());
        }
        a.stream()
                .filter(num -> num >= 0)

                .forEach(num->System.out.print(num+" "));

    }

    }

