package taskUser;

public class ERPSystem {
    private User[] memory= new User[1000];
    private int sizeOfUsers = 0;

    public void addUser(User u){
        memory[sizeOfUsers]=u;
        sizeOfUsers++;
    }
    public void printAllUsers(){
        for(int i=0;i<sizeOfUsers;i++){
            System.out.println(memory[i].getUserData());
        }
    }
    public void printAllStudents(){
        for(int i=0;i<sizeOfUsers;i++){
            if(memory[i] instanceof Student) {
                System.out.println(memory[i].getUserData());
            }
        }
    }

    public void printAllTeachers(){
        for(int i=0;i<sizeOfUsers;i++){
            if(memory[i] instanceof Teacher) {
                System.out.println(memory[i].getUserData());
            }
        }
    }


    public void printUser(int index){
        System.out.println(memory[index].getUserData());
    }

    public int getSizeOfUsers() {
        return sizeOfUsers;
    }
}
