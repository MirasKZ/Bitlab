package TaskUser;

public class Staff extends User{
    private double salary;
    private String subjects[] = new String[100];
    private int indexOfSubject = 0;

    public Staff(){
        super();
        this.salary=0;
    }
    public Staff(int id, String login,String password, String name, String surname,double salary){
        super(id, login, password, name, surname);
        this.salary=salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
    public void addSubject(String subject){
        subjects[indexOfSubject]=subject;
        indexOfSubject++;
    }

    @Override
    public void getData(){
        System.out.println("Staff "+id+" "+login+" "+password+" "+name+" "+surname+" salary: "+salary+" subjects: "+indexOfSubject);
        getSubjects();
    }
    public void getSubjects(){
        //System.out.println("subjects of Staff id "+id);
        for(int i=0;i<indexOfSubject;i++){
            System.out.print("----");
            System.out.println(subjects[i]);
        }
    }

}
