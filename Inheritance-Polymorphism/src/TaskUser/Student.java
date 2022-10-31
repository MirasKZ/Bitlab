package TaskUser;

public class Student extends User{
    private double gpa;
    private String courses[] = new String[100];
    private int indexOfCourses = 0;
    public Student(){
        super();
        this.gpa=0.0;
    }
    public Student(int id, String login,String password, String name, String surname,double gpa){
        super(id, login, password, name, surname);
        this.gpa=gpa;
    }
    public void setGpa(double gpa){
        this.gpa=gpa;
    }
    public double getGpa(){
        return gpa;
    }
    public void addCourse(String course){
        courses[indexOfCourses]=course;
        indexOfCourses++;
    }
    @Override
    public void getData(){
        System.out.println("Student "+id+" "+login+" "+password+" "+name+" "+surname+" gpa: "+gpa+" courses: "+indexOfCourses);
        getCourses();
    }
    public void getCourses(){
        //System.out.println("courses of Student id "+id);
        for(int i=0;i<indexOfCourses;i++){
            System.out.print("----");
            System.out.println(courses[i]);
        }
    }
}
