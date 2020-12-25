package model;

import java.util.ArrayList;

public class ClassSection {
    //fields
    private int myID;
    private ArrayList<Student> myStudentList = new ArrayList<>();
    //CONTENT

    //constructor
    public ClassSection(int id){
        myID = id;

    }
    //methods
    public void addStudent(Student stud){
        myStudentList.add(stud);
    }
    public void addStudentList(ArrayList<Student> studList){
        for(int i = 0; i<studList.size();i++){
            myStudentList.add(studList.get(i));
        }
    }
    public boolean isStudentInSection(Student stud){
        return myStudentList.contains(stud);
    }

    public boolean removeStudent(Student stud){
        return myStudentList.remove(stud);
    }

    public ArrayList<Student> getStudentList(){
       return myStudentList;
    }



}
