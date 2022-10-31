package TaskBook;

public class Library {
    protected String name;
    protected String city;
    private Book books[]= new Book[20];
    private int index=0;
    public Library(){
        this.name="";
        this.city="";
    }
    public Library(String name, String city){
        this.name=name;
        this.city=city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void addBook(Book book){
        try{
            books[index]=book;
            index++;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Library is full");
        }
    }
    public void printBooks(){
        for (int i=0;i<index;i++){
            try{
                String data=books[i].getData();
                System.out.println(i+" "+data);
            }
            catch(NullPointerException e){
                System.out.println(i+ " The book is empty");
            }

        }
    }

}
