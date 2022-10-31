package taskFood;

public class Main {
    public static void main(String[] args){
        Chocolate snickers= new Chocolate("Snickers",2);
        Chocolate twix=new Chocolate("Twix",1);
        Burger b1=new Burger("BurgerKing",2,1);
        Burger b2=new Burger("McDonalds",1,1);
        Coke cola=new Coke("Coca-cola",0.5,true);
        Coke fuse=new Coke("Fuse-tea",0.5,false);
        Food[] foods = {snickers,twix,b1,b2,cola,fuse};
        for(int i=0;i< foods.length;i++){
            System.out.println(foods[i].name+" "+foods[i].getCalories());
        }
        topCaloryFood(foods);

    }
        public static void topCaloryFood(Food[] foods){
            double maxCalorie=foods[0].getCalories();
            int maxIndex=0;
            for(int i=1;i< foods.length;i++){
                if(foods[i].getCalories()>maxCalorie) {
                    maxCalorie=foods[i].getCalories();
                    maxIndex=i;
                }
            }
            System.out.println("Top calories food: "+foods[maxIndex].name+ " calories: "+foods[maxIndex].getCalories());
        }

}
