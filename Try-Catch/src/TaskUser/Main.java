package TaskUser;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        User[] users = new User[5];

        for(int i=0;i<5;i++){
            Scanner in =new Scanner(System.in);
            System.out.println("Name?" );
            String name=in.next();
            System.out.println("Surname?" );
            String surname=in.next();
            System.out.println("Age?" );
            int age;
            try{
                age=in.nextInt();}
            catch(Exception e){
                age=0;
               // System.out.println("Error age inputMismatch");
            }
            users[i]=new User(name,surname,age);
        }
        int ave;
        int sum=0;
        for(int i=0;i< users.length;i++){
            sum=sum+users[i].getAge();
            System.out.println(users[i].getAge());
        }
        System.out.println("ave: "+sum/ users.length);

    }
}
