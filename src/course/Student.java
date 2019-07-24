package course;

public class Student {

  private String firstName;
  private String lastName;
  private Address homeAddress;
  private Address schoolAddress;
  private double[] testScores;

  public Student(String firstName, String lastName, Address homeAddress, Address schoolAddress) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.homeAddress = homeAddress;
    this.schoolAddress = schoolAddress;
  }

  public Student(String firstName, String lastName, Address homeAddress, Address schoolAddress,
                 double[] testScores){

  }

  public Student(String firstName, String lastName, Address homeAddress, Address schoolAddress,
                 double testScores[0] = 0, double testScore){

  }

  public int setTestScore(int[] testScores, int testNumber){

    return testNumber;
  }

  public double getTestScore(int testNumber){

    return testScores[testNumber + 1];

  }

  @Override
  public String toString()
  {
    String result;

    result = firstName + " " + lastName + "\n";
    result += "Home Address:\n" + homeAddress + "\n";
    result += "School Address:\n" + schoolAddress + "\n";

    return result;
  }

}