package TaskBook;

public class Main {
    public static void main(String[] args){
        Library library=new Library("Central","Almaty");
        for(int i=0;i<19;i++){
            Book b=new Book(1,"RobinsonKruso","Defoe");
            library.addBook(b);
        }
        Book b2=null;
        Book b3=new Book(1,"RoKruso","ferfergeg");
        library.addBook(b2);//book number 20
        library.printBooks();
        library.addBook(b3);//book number 21
        System.out.println(b3.getData());
    }
}
