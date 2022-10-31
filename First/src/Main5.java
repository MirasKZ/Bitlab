import java.util.Scanner;

public class Main5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Insert name: ");
        String name = in.next();
        System.out.println("Insert surname: ");
        String surname= in.next();

        System.out.println("Insert age: ");
        int age = in.nextInt();

        System.out.println("Имя: "+name);
        System.out.println("Фамилия: "+surname);
        System.out.println("Возраст: "+age);

    }
}
