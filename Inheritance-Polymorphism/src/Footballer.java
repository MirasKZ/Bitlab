public class Footballer extends Sportsman{
    protected String position;
    protected String club;
    public Footballer(){
        super();
        this.position="unknown";
        this.club="unknown";
    }
    public Footballer(String fullName, int age, String country,String position, String club){
        super(fullName, age, country);
        this.position=position;
        this.club=club;
    }
    @Override
    public void play(){
        System.out.println(fullName+" "+age+" years old "+position+", club "+club+" plays football for "+country);
    }

}
