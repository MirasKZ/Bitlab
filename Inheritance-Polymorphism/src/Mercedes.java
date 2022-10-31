public class Mercedes extends Car{
    protected String classType;
    public Mercedes(){
        super();
        this.classType="No name";
    }
    public Mercedes(String name, String model, int maxSpeed, int year,double volume,String classType){
        super(name,model,maxSpeed,year,volume);
        this.classType=classType;
    }
    @Override
    public void ride(){
        System.out.println("Mercedes "+name+" "+model+" " + maxSpeed + " hp " + year + ", " + volume + " "+classType+" class is riding.");
    }
}
