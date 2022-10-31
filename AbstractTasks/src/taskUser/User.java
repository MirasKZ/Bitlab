package taskUser;

public abstract class User {
    protected int id;
    protected String login;
    protected String password;
    public User(){
        this.id=0;
        this.login="";
        this.password="";
    }
    public User(int id, String login, String password){
        this.id=id;
        this.login=login;
        this.password=password;
    }
    public abstract String getUserData();
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
