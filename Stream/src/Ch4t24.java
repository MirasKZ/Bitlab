import java.util.ArrayList;
import java.util.Scanner;

public class Ch4t24 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(in.nextInt());
        }
        int m=in.nextInt();
        long count=a.stream().filter(i->i==m).count();
        if(count ==0) System.out.println("NO");
        else System.out.println("YES "+a.indexOf(m));
    }
}
