package TaskUser;

public class Main {
    public static void main(String[] args){
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
        User[] users={u1,u2,u3,u4,u5,u6,u7,u8,u9,u10,u11,u12,u13,u14,u15};
        u6.addSubject("java");
        u6.addSubject("english");
        u6.addSubject("Maths");
        u6.addSubject("yoga");
        u11.addCourse("mechanics");
        u11.addCourse("physics");
        u11.addCourse("art");
        for(int i=0;i<users.length;i++){
            users[i].getData();
        }
    }
}
