import TaskUser.Staff;

public class Task1 {
    public static void main(String[] args){
        Car c1=new Car("Audi","A6 Sedan",248,2018,2.0);
        Car c2=new Car("BMW","328",190,1998,2.8);
        Car c3=new Car("Kia","Rio",110,2014,1.6);
        Car t1 = new Toyota("Camry","XV40",145,2006,2.4,"Japan");
        Car t2= new Toyota("Camry","XV50",178,2011,2.5,"Thailand");
        Toyota t3=new Toyota("Corolla","E15",120,2006,1.6,"USA");
        Car m1=new Mercedes("Benz","E320",221,2002,3.2,"E");
        Mercedes m2= new Mercedes("Benz","S500",328,2008,5.5,"S");
        Mercedes m3= new Mercedes("Benz","E350",268,2007,3.5,"E");

        Car[] cars= {c1,c2,c3,t1,t2,t3,m1,m2,m3};
        for(int i=0;i<cars.length;i++){
            cars[i].ride();
        }

    }
}
