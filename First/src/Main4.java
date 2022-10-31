public class Main4 {
    public static void main(String[]args){

        Player[] RealMadridTeam={new Player(1,"Thibaut","Courtois","Goalkeeper"),
        new Player(2,"Daniel","Carvajal","Defender"),
        new Player(8,"Toni","Kroos","Midfielder"),
        new Player(9,"Karim","Benzema","Forward"),
        new Player(10,"Luka","Modric","Midfielder")};

        Player[] BarcelonaTeam={new Player(1,"Marc-Andre","Ter Stegen","Goalkeeper"),
        new Player(3,"Gerard","Pique","Defender"),
        new Player(5,"Sergio","Busquets","Midfielder"),
        new Player(9,"Robert","Lewandowski","Forward"),
        new Player(14,"Memphis","Depay","Forward")};

        Club RealMadrid=new Club("Real Madrid","Spain",25,RealMadridTeam);
        Club FCBarcelona=new Club("FCBarcelona","Spain",22,BarcelonaTeam);
        Club[] clubs={RealMadrid,FCBarcelona};
        for (int i=0;i<clubs.length;i++){
            clubs[i].printClubData();
        }
    }
}

class Player{
    int number;
    String name;
    String surname;
    String position;
    public Player(){
        this.number=0;
        this.name="No name";
        this.surname="No name";
        this.position="No position";
    }
    public Player(int number, String name, String surname, String position){
        this.number=number;
        this.name=name;
        this.surname=surname;
        this.position=position;
    }
    public String toString(){
        return number+" "+ name+ " "+surname+" "+position;
    }
}

class Club{
    String name;
    String country;
    int ratingPoints;
    Player []players;

    public Club(){
        this.name="No name";
        this.country="No name";
        this.ratingPoints=0;
        this.players=new Player[30];
    }
    public Club(String name, String country, int ratingPoints, Player[] players){
        this.name=name;
        this.country=country;
        this.ratingPoints=ratingPoints;
        this.players=players;
    }
    public void printClubData(){
        System.out.println("----------------------------------------------------------------");
        System.out.print(name);
        System.out.print("|");
        System.out.print(country);
        System.out.print("|");
        System.out.println(ratingPoints);
        System.out.println("----------------------------------------------------------------");
        for(int i=0;i<players.length;i++){
            System.out.println(players[i].toString());
        }
        System.out.println("-----------------------------------------------------------------");
        System.out.println();

    }

}
