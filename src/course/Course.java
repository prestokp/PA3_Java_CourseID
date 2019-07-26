package course;

import java.util.ArrayList;

public class Course {

    //String variable to hold the course name
    private String courseName;

    //Declares an array list to hold student objects
    private ArrayList<Student> studentList;

    //Constructor to instantiate the array list, studentList
    public void StudentList(){
        studentList = new ArrayList<>();
    }

    //Adds students to the course's student array list
    public void addStudent(Student student){
        studentList.add(student);
    }

    //Course constructor
    public Course(String courseName){
        this.courseName = courseName;
    }

    public void roll(){
        for(int i = 0; i < studentList.size(); i++){
            System.out.println(studentList.get(i) + " ");
            System.out.println();
        }
    }

    //Method to compute the course average
    //Iterate through student list with for each loop to get
    //proper average for course

    /*public void average(Student student){
        double total = 0;
        double avg;
        for (Student s : studentList){
            total = total + s.average();
        }
        avg = total/studentList.size();
        System.out.println("Course Average: " + avg);
    }*/

    public void average() {
        double total = 0;
        double avg;
        for (Student s : studentList){
            total = total + s.average();
        }
        avg = total/studentList.size();
        System.out.println("Course Average: " + avg);
    }
}
