package course;

public class Student {

  private String firstName;
  private String lastName;
  private Address homeAddress;
  private Address schoolAddress;

  public Student(String firstName, String lastName, Address homeAddress, Address schoolAddress) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.homeAddress = homeAddress;
    this.schoolAddress = schoolAddress;
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