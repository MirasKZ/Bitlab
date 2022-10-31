public class Gymnast extends Sportsman{
    protected int height;
    protected int weight;
    protected String style;

    public Gymnast(){
        super();
        this.height=0;
        this.weight=0;
        this.style="unknown";
    }
    public Gymnast(String fullName, int age, String country,int height, int weight, String style){
        super(fullName,age,country);
        this.height=height;
        this.weight=weight;
        this.style=style;
    }
    @Override
    public void play(){
        System.out.println(fullName+" "+age+" years old "+height+" cm "+weight+" kg "+" plays gymnastics in "+style+" style for "+country);
    }

}
