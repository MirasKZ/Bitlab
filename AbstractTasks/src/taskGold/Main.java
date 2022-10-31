package taskGold;

public class Main {
    public static void main(String[] args) {
        SphereGold g1 = new SphereGold(2);
        SphereGold g2 = new SphereGold(3);
        SphereGold g3 = new SphereGold(4);
        CubeGold c1 = new CubeGold(2);
        CubeGold c2 = new CubeGold(3);
        CubeGold c3 = new CubeGold(4);
        GoldShape[] shapes = {g1, g2, g3, c1, c2, c3};
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].getPrice());
        }
    }

}
