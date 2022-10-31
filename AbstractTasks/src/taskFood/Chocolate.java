package taskFood;

public class Chocolate extends Food {
    protected int weight;
    Chocolate(String name, int weight){
        super(name);
        this.weight=weight;
    }

    public double getCalories(){
        return (double) weight*140;
    }

}
