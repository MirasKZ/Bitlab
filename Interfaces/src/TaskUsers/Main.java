package TaskUsers;

public class Main {
    public static void main(String[] args){
        Users u1=new Users("Miras","Yerikov");
        Users u2=new Users("Mebetbe","Yerikov");
        Users u3=new Users("regethe","Ye34rkov");
        Users u4=new Users("Mrgets","Y34rv");
        Users u5=new Users("Miertg","Ye34rkov");
        Users u6=new Users("Mirartgr","Y34r3r");
        Users u7=new Users("Mirrtg","Yerikov");
        Users u8=new Users("Miras","Yegre");
        Users u9=new Users("Miras","Ye3r2r");
        Users u10=new Users("Miras","Ye34r");
        Users[] users={u1,u2,u3,u4,u5,u6,u7,u8,u9,u10};
        UserBeanImp userImp= new UserBeanImp(users);
        userImp.getAllUsers();
        System.out.println("*************");
        userImp.getUsersByName("Miras");
        System.out.println("*************");
        userImp.getUsersBySurname("Yerikov");

       }
}
