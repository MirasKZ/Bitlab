package TaskWorkers;

public class HRManagers implements Workers{
    protected int id;
    protected String fullName;
    protected int salary;

    public HRManagers(){
        this.id=0;
        this.fullName="";
        this.salary=0;
    }
    public HRManagers(int id, String fullName, int salary){
        this.id=id;
        this.fullName=fullName;
        this.salary=salary;
    }
    public String getWorkerData() {

        return id+" "+fullName+" "+salary;
    }
    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
