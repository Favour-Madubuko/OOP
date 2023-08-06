/*This program is written to test an understanding of constructors, objects and references in OOP. This is the Person class for this program */
public class Person {
  //The set and get methods defined from each instantiated variables
  private String Name;
  private int Age;
  private String Gender;

  public Person() {
    this.Name = "No name yet";
    this.Age = 19;
    this.Gender = "Male";
  }

  public Person(String Name, int Age, String Gender) {
    this.Name = Name;
    boolean correctInput = ((Gender == "Male") || (Gender == "Female") || (Gender == "F")
        || (Gender == "M") || (Gender == "male") || (Gender == "female") || (Gender == "m") || (Gender == "f"));

    if ((Age < 0) || (correctInput == false))
      System.exit(0);
    this.Age = Age;
    this.Gender = Gender;
  }


  public String getName() {
    return Name;
  }

  public void setName(String newName) {
    Name = newName;
  }

  public int getAge() {
    return Age;
  }

  public void setAge(int newAge) {
    Age = newAge;
  }

  public String getGender() {
    return Gender;
  }

  public void setGender(String newGender) {
    Gender = newGender;
  }

  public String toString() {
    return "Your name is " + Name + ", you are " + Age + " years old " + "and you are a " + Gender;
  }

  public void setPerson(String newName, int newAge, String newGender) {
    Name = newName;
    boolean correctInput = ((newGender == "Male") || (newGender == "Female") || (newGender == "F")
        || (newGender == "M") || (newGender == "male") || (newGender == "female") || (newGender == "m")
        || (newGender == "f"));

    if ((newAge < 0) || (correctInput == false))
      System.exit(0);

    Age = newAge;
    Gender = newGender;

  }

  public boolean equals(Person otherName) {
    return Name.equals(otherName.getName()) && Age == otherName.getAge();
  }

  public boolean sameName(Person otherName) {
    return Name.equals(otherName.getName());
  }

  public boolean sameAge(Person otherAge) {
    return Age == (otherAge.getAge());
  }

  public boolean older(Person otherAge2) {
    return Age > (otherAge2.getAge());
  }

  public boolean younger(Person otherAge2) {
    return Age < (otherAge2.getAge());
  }
}  