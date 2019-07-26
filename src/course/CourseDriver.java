package course;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CourseDriver {

  public static void main(String[] args) {

    double courseAverage;

    // scanner for key board
    Scanner keyboard = new Scanner(System.in);
    //prompt
    System.out.println("Course Name: ");
    //create new course with keyboard input as argument
    Course alphaCourse = new Course(keyboard.next());
    Scanner sc = null; //assigned a value to prevent a program failure
    try{
      sc = new Scanner(new File("students.txt")); //streams the file through file object
    }
    catch(IOException e){
      e.printStackTrace();
    }//Catch Block Delimiter

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
      Address home = new Address(homeStreet, homeCity, homeState, Integer.parseInt(homeZip));
      Address school = new Address(schoolStreet, schoolCity, schoolState, Integer.parseInt(schoolZip));

      Student alphaStudent = new Student(firstName, lastName, home, school, Double.parseDouble(testScore1),
              Double.parseDouble(testScore2), Double.parseDouble(testScore3));

      //Public methods from the course class to be implemented
      alphaCourse.addStudent(alphaStudent);


    }//While loop delimiter
    alphaCourse.roll();
    alphaCourse.average();

  }//Main function delimiter

}//Public Class Delimiter
