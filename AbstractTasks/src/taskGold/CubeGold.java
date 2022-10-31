package taskGold;

public class CubeGold extends GoldShape{
    protected double side;
    public CubeGold(double side){
        this.side=side;
    }
    public double getVolume(){
        return side*side*side;
    }
}
