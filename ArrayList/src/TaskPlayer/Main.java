package TaskPlayer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
       Players p1=new Players("Ronaldo",100000,35);
        Players p2=new Players("Ronaldo",110000,35);
        Players p3=new Players("Ronaldo",103000,35);
        Players p4=new Players("Ronaldo",120000,35);
        Players p5=new Players("Ronaldo",140000,35);
        Players p6=new Players("Ronaldo",150000,35);
        Players p7=new Players("Ronaldo",170000,35);
        Players p8=new Players("Ronaldo",120000,35);
        Players p9=new Players("Ronaldo",164000,35);
        Players p10=new Players("Ronaldo",700000,35);
        ArrayList<Players> players = new ArrayList<>();
        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);
        players.add(p5);
        players.add(p6);
        players.add(p7);
        players.add(p8);
        players.add(p9);
        players.add(p10);
        double totalPrice=0;
        int totalAge=0;
        for(int i=0;i<players.size();i++){
            totalPrice=totalPrice+players.get(i).getPrice();
            totalAge=totalAge+players.get(i).getAge();
        }
        System.out.println("Average price: "+ totalPrice/players.size());
        System.out.println("Total age: "+totalAge);
    }
}
