package m.example.com.broadcastreceiverdemo;

/**
 * Created by Zafar.Hussain on 01/04/2019.
 */

public class User {
    String fullname;
    String email;

    public User() {

    }

    public User(String fullname, String email) {
        this.fullname = fullname;
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
