package edu.csumb.flightapp.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "User")
public class User {
    @PrimaryKey(autoGenerate = true)
    long id;

    private String userName;
    private String password;

    //no arg constructor
    public User() {}

    @Ignore
    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    //getters and setters
    public String getUserName() {
        return userName;
    }

    public String getPassword(){
        return password;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setPassword(String password){
        this.password = password;
    }

    // toString method
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
