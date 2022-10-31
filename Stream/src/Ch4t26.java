import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ch4t26 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(in.nextInt());
        }
        IntStream.range(0,a.size())
                .forEach(i-> System.out.print(a.get(a.size()-1-i)+" "));
    }
}
