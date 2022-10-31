import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.stream.IntStream;

public class Ch4t20 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(in.nextInt());
        }

        int max=a.stream().max(Integer::compareTo).get();
        int index=a.indexOf(max);
        System.out.println(max+" "+index);
    }
}
