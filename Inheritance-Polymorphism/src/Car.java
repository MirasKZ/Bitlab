public class Car {
    protected String name;
    protected String model;
    protected int maxSpeed;
    protected int year;
    protected double volume;
    public Car(){
        this.name="No name";
        this.model="No name";
        this.maxSpeed=0;
        this.year=0;
        this.volume=0.0;
    }
    public Car(String name, String model, int maxSpeed, int year, double volume){
        this.name=name;
        this.model=model;
        this.maxSpeed=maxSpeed;
        this.year=year;
        this.volume=volume;
    }
    public void ride() {
        System.out.println("Car " + name + " " + model + " " + maxSpeed + " hp " + year + " " + volume + " is riding.");
    }
}
