package taskGold;

public class SphereGold extends GoldShape{
    protected double radius;
    public SphereGold(double radius){
        this.radius=radius;
    }
    public double getVolume(){
        return 4*3.14*Math.pow(radius,3)/3;
    }
}
