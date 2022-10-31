package taskUser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        ERPSystem sys= new ERPSystem();
        int choice=0;
        int index=0;
        while(true){
            System.out.println("PRESS [1] TO ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [3] TO LIST USER BY INDEX");
            System.out.println("PRESS [0] TO EXIT");
            choice=in.nextInt();
            if(choice==1){
                System.out.println("PRESS [1] TO ADD STUDENT");
                System.out.println("PRESS [2] TO ADD TEACHER");
                choice=in.nextInt();
                if(choice==1){
                    int id=index;
                    index++;
                    System.out.println("login?");
                    String login=in.next();
                    System.out.println("password?");
                    String password=in.next();
                    System.out.println("name?");
                    String name=in.next();
                    System.out.println("surname?");
                    String surname= in.next();
                    System.out.println("Group?");
                    String group= in.next();
                    System.out.println("gpa?");
                    double gpa=in.nextDouble();
                    sys.addUser(new Student(id,login,password,name,surname,group,gpa));
                }
                else if(choice==2){
                    int id=index;
                    index++;
                    System.out.println("login?");
                    String login=in.next();
                    System.out.println("password?");
                    String password=in.next();
                    System.out.println("nickName?");
                    String nickName=in.next();
                    System.out.println("status?");
                    String status=in.next();
                    Teacher t=new Teacher(id,login,password,nickName,status);
                    System.out.println("PRESS [1] TO ADD SUBJECT");
                    System.out.println("PRESS [0] TO FINISH ADDING SUBJECT");
                    choice=in.nextInt();
                    if(choice==1){
                        System.out.print("Subject: ");
                        String subject=in.next();
                        t.addSubject(subject);
                    } else if (choice==0) {
                        continue;                       
                    }
                    sys.addUser(t);
                }
            } else if (choice==2) {
                System.out.println("PRESS [1] TO LIST STUDENTS");
                System.out.println("PRESS [2] TO LIST TEACHERS");
                choice=in.nextInt();
                if(choice==1){
                    sys.printAllStudents();
                } else if (choice==2) {
                    sys.printAllTeachers();
                }
            }
            else if(choice==3){
                System.out.println("Enter index: ");
                int indexxx=in.nextInt();
                sys.printUser(indexxx);
            }
            else if(choice==0){
                break;
            }
        }
    }

}
