import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ch4t7 {
public static void main(String[] args){
    Scanner in =new Scanner(System.in);
    int n=in.nextInt();
    ArrayList<Integer> a=new ArrayList<>();
    for(int i=0;i<n;i++){
        a.add(in.nextInt());
    }
    IntStream.range(0, a.size())
            .filter(i -> i % 2 == 0)
            .mapToObj(i -> a.get(i)).forEach(o->System.out.print(o+" "));
//                .collect(Collectors.toList());

}
}
