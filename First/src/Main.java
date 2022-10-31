

public class Main {

    public static void main(String[] args) {
        Phone p1= new Phone("iPhone","13",1300,256);
        Phone p2=new Phone("Samsung galaxy","S2",300,64);
        Phone p3=new Phone("Samsung galaxy","A03",100,32);
        Phone p4=new Phone("Samsung Galaxy","s20",550,128);
        Phone p5=new Phone("iPhone","13 mini Blue",800,128);
        Phone p6=new Phone("iPhone","11",600,64);
        Phone p7=new Phone("iPhone","10",500,64);
        Phone p8=new Phone("Xiao Mi","11 Lite",300,128);
        Phone p9=new Phone("Huawei","p40 Lite",200, 128);
        Phone p10= new Phone("iPhone","11 Slim Box",600,128);
        Phone[] phones={p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};
        for (Phone p: phones){
            if(p.getCategory()=="Top"||p.getCategory()=="Simple"){
                System.out.println(p.getName()+" "+p.getModel()+" "+p.getPrice()+" "+p.getMemory());
            }
        }
    }
}
