package taskFood;

public class Coke extends Food{
    protected double volumeLiters;
    protected boolean isSparkling;

    public Coke(String name,double volumeLiters, boolean isSparkling){
        super(name);
        this.volumeLiters=volumeLiters;
        this.isSparkling=isSparkling;
    }
    public double getCalories(){
        if(isSparkling) return (double) volumeLiters*400;
        else return (double) volumeLiters*100;
    }

}
