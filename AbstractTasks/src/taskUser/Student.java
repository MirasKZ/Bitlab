package taskUser;

public class Student extends User{
    protected  String name;
    protected String surname;
    protected String group;
    protected double gpa;
    public Student(){
        super();
        this.name="";
        this.surname="";
        this.group="";
        this.gpa=0;
    }
    public Student(int id, String login, String password,String name, String surname, String group, double gpa){
        super(id,login,password);
        this.name=name;
        this.surname=surname;
        this.group=group;
        this.gpa=gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getUserData(){
        return id+" "+login+" "+password+" "+name+" "+surname+" "+group+" "+gpa;
    }
}
