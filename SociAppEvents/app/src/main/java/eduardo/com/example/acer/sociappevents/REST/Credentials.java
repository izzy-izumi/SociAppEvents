package eduardo.com.example.acer.sociappevents.Rest;

/**
 * Created by LUIS ANGEL on 02/07/2015.
 */
public class Credentials {
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {return token;}

    public void setToken(String token) {this.token = token;}

    private String email;
    private String password;
    private String token;

}
