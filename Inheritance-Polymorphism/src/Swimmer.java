public class Swimmer extends Sportsman {
    protected String style;
    protected double recordTime;

    public Swimmer() {
        super();
        this.style = "unknown";
        this.recordTime = 0.0;
    }

    public Swimmer(String fullName, int age, String country, String style, double recordTime) {
        super(fullName, age, country);
        this.style = style;
        this.recordTime = recordTime;
    }

    @Override
    public void play() {
        System.out.println(fullName + " "+age+" years old "+ "with recordTime "+recordTime+" plays swimming " + style+" for "+country);
    }

}
