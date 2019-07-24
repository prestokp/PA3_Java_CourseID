package course;

import java.util.ArrayList;

public class Course {

    //String variable to hold the course name
    private String courseName;

    //Declares an array list to hold student objects
    ArrayList<Student> students = new ArrayList<Student>();

    //Course constructor
    public Course(String courseName){
        this.courseName = courseName;
    }

    //Method to add students to the course
    public void addStudent(Student incomingStudent){

    }

    //Method to compute the course average
    public double average(Student student){
        double average = student.average()/
    }
}
