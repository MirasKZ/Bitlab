public class MainOlympicGames {
    public static void main(String[] args){
        Gymnast g1=new Gymnast("Elena Belova",18,"Russia",165,55,"trampoline");
        Gymnast g2=new Gymnast("Katie Ian",19,"Canada",168,57,"artistic");
        Gymnast g3=new Gymnast("Jose Alivieiro", 20,"Spain",170,68,"horizontal bar");
        Footballer f1=new Footballer("Cristiano Ronaldo",37,"Portugal","Forward","Manchester United");
        Footballer f2=new Footballer("Lionel Messi",35, "Argentina","Forward","PSG");
        Footballer f3= new Footballer("Neymar da Silva Santos Júnior",30,"Brazil", "Forward","PSG");
        Swimmer s1=new Swimmer("Michael Phelps",37,"USA","Mens's 200m",102.96);
        Swimmer s2=new Swimmer("Katie Ledecky",25,"USA","Women's 1500m",935);
        Swimmer s3=new Swimmer("Yang Sun",30,"China","Men's 1500m",871);

        Sportsman[] sportmansList={g1,g2,g3,f1,f2,f3,s1,s2,s3};
        OlympicGames game1= new OlympicGames("Dubai",2030, sportmansList);
        game1.play();

    }
}
