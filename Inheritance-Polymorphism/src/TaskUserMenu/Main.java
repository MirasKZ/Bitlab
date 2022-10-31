package TaskUserMenu;

import TaskUser.Staff;
import TaskUser.Student;
import TaskUser.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int choice=0;
        User u1= new User(11,"aaa","aaa","aaa","aaa");
        User u2= new User(12,"bbb","bbbbb","bbbbb","bbbbbb");
        User u3= new User(13,"cccc","ccccc","cccc","cccc");
        User u4= new User(14,"ddddd","ddddd","dddddd","ddddd");
        User u5= new User(15,"eeeeee","eeeee","eeee","eeeeee");
        Staff u6= new Staff(21,"fffff","fffff","fffff","fffff",100000);
        Staff u7=new Staff(22,"ggggg","ggggg","ggggg","ggggg",200000);
        Staff u8=new Staff(23,"hhhhh","hhhhh","hhhhh","hhhhh",3000000);
        Staff u9=new Staff(24,"iiiii","iiiii","iiiii","iiiii",400000);
        Staff u10=new Staff(25,"jjjjj","jjjjj","jjjjj","jjjjj",500000);
        Student u11=new Student(31,"kkkkk","kkkkk","kkkkk","kkkkk",1231);
        Student u12=new Student(32,"lllll","lllll","lllll","lllll",42342);
        Student u13=new Student(33,"mmmmmm","mmmmmm","mmmmmm","mmmmmm",32234);
        Student u14=new Student(34,"nnnnnn","nnnnnn","nnnnnn","nnnnnn",234234);
        Student u15=new Student(35,"ooooo","ooooo","ooooo","ooooo",234234);
        User[] users= new User[100];
        users[0]=u1;
        users[1]=u2;
        users[2]=u3;
        users[3]=u4;
        users[4]=u5;
        users[5]=u6;
        users[6]=u7;
        users[7]=u8;
        users[8]=u9;
        users[9]=u10;
        users[10]=u11;
        users[11]=u12;
        users[12]=u13;
        users[13]=u14;
        users[14]=u15;
        int index=15;
        u6.addSubject("java");
        u6.addSubject("english");
        u6.addSubject("Maths");
        u6.addSubject("yoga");
        u11.addCourse("mechanics");
        u11.addCourse("physics");
        u11.addCourse("art");

        while(true){
            System.out.println("PRESS [1] ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [0] TO EXIT");
            choice =in.nextInt();
            if(choice==1){
                System.out.println("PRESS [1] TO ADD STUDENT");
                System.out.println("PRESS [2] TO ADD STAFF");
                choice=in.nextInt();
                if(choice==1){
                    System.out.println("Insert id");
                    int id=in.nextInt();
                    System.out.println("Insert login?");
                    String login=in.next();
                    System.out.println("Insert password");
                    String password=in.next();
                    System.out.println("Insert name?");
                    String name=in.next();
                    System.out.println("Insert surname?");
                    String surname=in.next();
                    System.out.println("Insert gpa?");
                    double gpa=in.nextDouble();
                    System.out.println("Insert course?");
                    Student x = new Student(id,login,password,name,surname,gpa);
                    x.addCourse(in.next());
                    users[index]=x;
                    index++;
                }
                else if(choice==2){
                    System.out.println("Insert id");
                    int id=in.nextInt();
                    System.out.println("Insert login?");
                    String login=in.next();
                    System.out.println("Insert password");
                    String password=in.next();
                    System.out.println("Insert name?");
                    String name=in.next();
                    System.out.println("Insert surname?");
                    String surname=in.next();
                    System.out.println("Insert salary?");
                    double salary=in.nextDouble();
                    System.out.println("Insert subject?");
                    Staff y=new Staff(id,login,password,name,surname,salary);
                    y.addSubject(in.next());
                    users[index]=y;
                    index++;
                }
            } else if (choice==2) {
                System.out.println("PRESS [1] TO LIST STUDENTS");
                System.out.println("PRESS [2] TO LIST STAFF");
                choice=in.nextInt();
                if(choice==1){
                    for(int i=0;i<index;i++){
                        if(users[i] instanceof Student) {
                            users[i].getData();
                        }
                    }
                } else if (choice==2) {
                    for(int i=0;i<index;i++) {
                        if (users[i] instanceof Staff){
                            users[i].getData();
                        }
                    }
                }
            } else if (choice==0) {
             break;
            }
        }
    }
}
