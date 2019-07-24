package course;

public class Student {

  private String firstName;
  private String lastName;
  private Address homeAddress;
  private Address schoolAddress;
  private int testNumber;
  private double[] testScores;
  private double score1, score2, score3;

  public Student(String firstName, String lastName, Address homeAddress, Address schoolAddress) {
    /*this.firstName = firstName;
    this.lastName = lastName;
    this.homeAddress = homeAddress;
    this.schoolAddress = schoolAddress;*/
    this(firstName, lastName, homeAddress, schoolAddress, 0, 0, 0);
  }

  public Student(String firstName, String lastName, Address homeAddress, Address schoolAddress, double[] testScores){
    this(firstName, lastName, homeAddress, schoolAddress, testScores[0], testScores[1], testScores[2]);
  }

  public Student(String firstName, String lastName, Address homeAddress, Address schoolAddress,
                 double score1, double score2, double score3){
    this.firstName = firstName;
    this.lastName = lastName;
    this.homeAddress = homeAddress;
    this.schoolAddress = schoolAddress;
    testScores[0] = score1;
    testScores[1] = score2;
    testScores[2] = score3;
  }

  public double getTestScore(int testNumber){
    return testScores[testNumber];
  }

  public double setTestScore(double[] testScores, int testNumber){
    return 0;
  }

  public double average(double score1, double score2, double score3){
    return (score1 + score2 + score3)/3.0;
  }

  public double average(double[] testScores){
    return (testScores[0] + testScores[1] + testScores[2])/testScores.length;
  }


  @Override
  public String toString()
  {
    String result;

    result = firstName + " " + lastName + "\n";
    result += "Home Address:\n" + homeAddress + "\n";
    result += "School Address:\n" + schoolAddress + "\n";
    result += "Test Scores:\n" + testScores[0] + "\n" +
            testScores[1] + "\n" + testScores[2] + "\n";
    result += "Test Average:\n" + average(testScores);

    return result;
  }

}