package seminar3.tdd;

public class User {

    String name;
    String password;
    boolean isAdmin;
    boolean isAuthenticate = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;

    }

    // аудентификация по логину и поролю
    public boolean authenticate(String name, String password) {
        if(this.name.equals(name) && this.password.equals(password));{
            isAuthenticate = true;
            return true;
        }
    }

}