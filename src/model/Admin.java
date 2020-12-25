package model;

import java.util.ArrayList;

public class Admin extends User{
    //fields
    private ArrayList<Instructor> instructorList = new ArrayList<>();
    private ArrayList<Student> studentList  = new ArrayList<>();
    //constructors
    public Admin(int userID) {
        super(userID);
    }
    //methods
}
