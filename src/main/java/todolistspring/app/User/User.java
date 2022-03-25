package todolistspring.app.User;

import java.time.LocalDate;

public class User {
    private int userID;
    private String userName;
    private String password;
    private LocalDate creationDate;

    
    public User(int userID, String userName, String password, LocalDate creationDate) {
        this.userID = userID;
        this.userName = userName;
        this.password = password;
        this.creationDate = creationDate;
    }


    public User(String userName, String password, LocalDate creationDate) {
        this.userName = userName;
        this.password = password;
        this.creationDate = creationDate;
    }

    public int getUserID() {
        return userID;
    }


    public String getUserName() {
        return userName;
    }


    public String getPassword() {
        return password;
    }


    public LocalDate getCreationDate() {
        return creationDate;
    }


    public void setUserID(int userID) {
        this.userID = userID;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    

}
