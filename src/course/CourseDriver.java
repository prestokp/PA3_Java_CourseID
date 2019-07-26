package course;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CourseDriver {

  public static void main(String[] args) {

    // scanner for keyboard
    Scanner keyboard = new Scanner(System.in);

    //prompt
    System.out.println("Course Name: ");

    //create new course with keyboard input as argument
    Course alphaCourse = new Course(keyboard.next());

    //assigned a value to prevent a program failure
    Scanner sc = null;
    try{
      sc = new Scanner(new File("students.txt")); //streams the file through file object
    }
    catch(IOException e){
      e.printStackTrace();
    }//Catch Block Delimiter

    //While loop to facilitate file stream from file to variable
    while(sc.hasNext()){

      //Reads in the lines from the text file and assign
      //them to string variables
      String firstName = sc.nextLine();
      String lastName = sc.nextLine();
      String homeStreet = sc.nextLine();
      String homeCity = sc.nextLine();
      String homeState = sc.nextLine();
      String homeZip = sc.nextLine();
      String schoolStreet = sc.nextLine();
      String schoolCity = sc.nextLine();
      String schoolState = sc.nextLine();
      String schoolZip = sc.nextLine();
      String testScore1 = sc.nextLine();
      String testScore2 = sc.nextLine();
      String testScore3 = sc.nextLine();

      //Burns the blank line so that the program can proceed with reading the file
      if (sc.hasNext()){
        sc.nextLine();
      }//Conditional Delimiter

      //Instantiates address objects to file data has a place to go
      Address home = new Address(homeStreet, homeCity, homeState, Integer.parseInt(homeZip));
      Address school = new Address(schoolStreet, schoolCity, schoolState, Integer.parseInt(schoolZip));

      //Instantiates a student object to have a place to store file data for student
      Student alphaStudent = new Student(firstName, lastName, home, school, Double.parseDouble(testScore1),
              Double.parseDouble(testScore2), Double.parseDouble(testScore3));

      //addStudent method from course class to add student object into course
      alphaCourse.addStudent(alphaStudent);

    }//While loop delimiter

    //Roll method to display list of students in class
    alphaCourse.roll();

    //Average method to get course average
    alphaCourse.average();

  }//Main function delimiter

}//Public Class Delimiter
