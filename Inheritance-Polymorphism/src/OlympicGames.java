public class OlympicGames {
    protected String city;
    protected int year;
    protected Sportsman[] sportsmansList;
    public OlympicGames(){
        this.city="unknown";
        this.year=0;
        this.sportsmansList=null;
    }
    public OlympicGames(String city, int year, Sportsman[] sportsmansList){
        this.city=city;
        this.year=year;
        this.sportsmansList=sportsmansList;
    }

    public void play(){
        for(int i=0;i<sportsmansList.length;i++){
            sportsmansList[i].play();
        }
    }
}
