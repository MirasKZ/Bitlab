package taskEngine;

public class Main {
    public static void main(String[] args){
        FerrariEngine f1=new FerrariEngine(2,4,120);
        FerrariEngine f2=new FerrariEngine(2.2,4,130);
        FerrariEngine f3=new FerrariEngine(3,6,130);
        FerrariEngine f4=new FerrariEngine(4,8,140);
        FerrariEngine f5=new FerrariEngine(2.5,6,125);
        RenaultEngine r1=new RenaultEngine(2,4,120,50);
        RenaultEngine r2=new RenaultEngine(2.2,4,130,60);
        RenaultEngine r3=new RenaultEngine(3,6,130,70);
        RenaultEngine r4=new RenaultEngine(4,8,140,40);
        RenaultEngine r5=new RenaultEngine(2.5,4,125,10);
        Engine[] engines={f1,f2,f3,f4,f5,r1,r2,r3,r4,r5};
        for(int i=0;i<engines.length;i++){
            if(engines[i] instanceof FerrariEngine){
            System.out.println("Ferrari vol :"+engines[i].engineVolume+" cyl: "+engines[i].cylinderAmount+" wei: "+engines[i].engineWeight+" maxsSpeed: " +engines[i].getMaxSpeed());}
            else {
                System.out.println("Renault vol :"+engines[i].engineVolume+" cyl: "+engines[i].cylinderAmount+" wei: "+engines[i].engineWeight+" maxsSpeed: " +engines[i].getMaxSpeed());}
        }
    }
}
