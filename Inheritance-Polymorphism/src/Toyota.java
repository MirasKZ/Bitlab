public class Toyota extends Car {
    protected String manufacturer;

    public Toyota(){
        super();
        this.manufacturer="No name";
    }
    public Toyota(String name, String model, int maxSpeed, int year,double volume, String manufacturer){
        super(name,model,maxSpeed,year,volume);
        this.manufacturer=manufacturer;
    }
    @Override
    public void ride(){
        System.out.println("Toyota "+name+" "+model+" " + maxSpeed + " hp " + year + " " + volume + " "+manufacturer+" is riding.");
    }
}
