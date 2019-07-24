package course;

public class CourseDriver {

  public static void main(String[] args) {

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

    }//While loop delimiter
      //Public methods from the course class to be implemented
      Course.Roll();
      Course.average();

  }//Main function delimiter

}//Public Class Delimiter
