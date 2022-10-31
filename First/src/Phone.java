public class Phone{
    private String name;
    private String model;
    private int price;
    private int memory;

    public Phone(){
        this.name="No name";
        this.model="No name";
        this.price=0;
        this.memory=0;
    }

    public Phone(String name, String model, int price, int memory){
        this.name=name;
        this.model=model;
        this.price=price;
        this.memory=memory;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public String getCategory(){
        if (price>1000) return "Top";
        else if(price<=1000 && price >=500) return "Medium";
        else return "Simple";
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel(){
        return model;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
    public void setMemory(int memory){
        this.memory=memory;
    }
    public int getMemory(){
        return memory;
    }
}