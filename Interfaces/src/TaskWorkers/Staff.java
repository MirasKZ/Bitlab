package TaskWorkers;

public class Staff implements Workers{
    protected int id;
    protected String name;
    protected String surname;
    protected int salary;
    public Staff(){
        this.id=0;
        this.name="";
        this.surname="";
        this.salary=0;
    }
    public Staff(int id, String name, String surname, int salary){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.salary=salary;
    }

    public String getWorkerData() {

        return id+" "+name+" "+surname+" "+salary;
    }
    public int getSalary(){
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
