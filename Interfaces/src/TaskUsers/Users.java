package TaskUsers;

public class Users {
    protected String name;
    protected String surname;
    public Users(){
        this.name="";
        this.surname="";
    }
    public Users(String name, String surname){
        this.name=name;
        this.surname=surname;
    }
    public void setName(String name){
        this.name=name;
        this.surname=surname;
    }
    public String getName(){
        return name;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public String getSurname(){
        return surname;
    }


}
