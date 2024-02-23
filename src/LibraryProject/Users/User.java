package LibraryProject.Users;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public abstract class User {
    int id;
    String login;
    String password;
    String firstName;
    String lastName;
    Role role;
    public User(){
        super();
    }
    public User (String login, String password){
        this.login = login;
        this.password = password;
    }
    public User(int id, String login, String password, String firstName, String lastName, String role){
        this.id = id;
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = Role.valueOf(role);
    }
    public  void activate(String login){};
    public  void deActivate(String login){};

    public abstract boolean userAuthorization(String login, String password);
    public abstract void menu();



}
