package TaskUser;

public class User {
    protected int id;
    protected String login;
    protected String password;
    protected String name;
    protected String surname;
    public User(){
        this.id=0;
        this.login="";
        this.password="";
        this.name="";
        this.surname="";
    }
    public User(int id, String login,String password, String name, String surname){
        this.id=id;
        this.login=login;
        this.password=password;
        this.name=name;
        this.surname=surname;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setLogin(String login){
        this.login=login;
    }
    public String getLogin(){
        return login;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }
    public void setName(String name){
        this.name=name;
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

    public void getData(){
        System.out.println("User "+id+" "+login+" "+password+" "+name+" "+surname);
    }
}
