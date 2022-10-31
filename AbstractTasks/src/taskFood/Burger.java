package taskFood;

public class Burger extends Food{
    protected int meatAmount;
    protected int meatType;
    public Burger(String name,int meatAmount,int meatType){
        super(name);
        this.meatAmount=meatAmount;
        this.meatType=meatType;
    }

    public double getCalories(){
        if(meatType==1) return (double) 840*meatAmount;
        else return (double) 560*meatAmount;
    }

}
