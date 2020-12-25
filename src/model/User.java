package model;

public class User {
    //fields
    private int myUserID;
    //constructors
    public User(int userID){
        myUserID = userID;
    }
    //methods
    public int getUserID(){
        return myUserID;
    }

    public void setUserId(int newUserID){
        myUserID = newUserID;
    }
}
