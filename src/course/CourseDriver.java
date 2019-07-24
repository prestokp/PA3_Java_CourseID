package course;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CourseDriver {

  public static void main(String[] args) {

    String[] students = new String[];

    Scanner sc = null; //prevents program failure

    try{
      sc = new Scanner(new File("students.txt"));
    }

    catch(IOException e){
      e.printStackTrace();
    }

  }

}
