public class Sportsman {
    protected String fullName;
    protected int age;
    protected String country;

    public Sportsman() {
        this.fullName="No name";
        this.age=0;
        this.country="No name";
    }
    public Sportsman(String fullName, int age, String country){
        this.fullName=fullName;
        this.age=age;
        this.country=country;
    }
    public void play(){
        System.out.println(fullName+" "+age+" years old"+" plays some sport for "+country);
    }
}
