package domain;

public class Arbitru extends Entity<Long>{
    private String username;
    private String password;
    private String name;


    public Arbitru()
    {

    }


    public Arbitru(String username, String pasword, String name) {
        this.username = username;
        this.password = pasword;
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String pasword) {
        this.password = pasword;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
