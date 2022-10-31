package TaskWorkers;

public class Programmers implements Workers{
    protected int id;
    protected String nickname;
    protected int salary;
    protected int bonusSalary;
    protected double KPIValue;

    public Programmers(){
        this.id=0;
        this.nickname="";
        this.salary=0;
        this.bonusSalary=0;
        this.KPIValue=0;
    }
    public Programmers(int id, String nickname, int salary,int bonusSalary,double KPIValue){
        this.id=id;
        this.nickname=nickname;
        this.salary=salary;
        this.bonusSalary=bonusSalary;
        this.KPIValue=KPIValue;
    }


    public String getWorkerData() {
        return id+" "+nickname+" "+salary+" "+bonusSalary+" "+KPIValue;
    }
    public int getSalary(){
        return (int)(salary+KPIValue*bonusSalary);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(int bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public double getKPIValue() {
        return KPIValue;
    }

    public void setKPIValue(double KPIValue) {
        this.KPIValue = KPIValue;
    }
}
