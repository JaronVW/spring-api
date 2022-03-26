package todolistspring.app.Models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class User {

    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1

    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )

    private int id;
    private String userName;
    private String password;
    private LocalDate creationDate;



    public User(int userID, String userName, String password, LocalDate creationDate) {
        this.id = userID;
        this.userName = userName;
        this.password = password;
        this.creationDate = creationDate;
    }


    public User(String userName, String password, LocalDate creationDate) {
        this.userName = userName;
        this.password = password;
        this.creationDate = creationDate;
    }

    public User() {

    }

    public int getId() {
        return id;
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


    public void setId(int userID) {
        this.id = userID;
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
