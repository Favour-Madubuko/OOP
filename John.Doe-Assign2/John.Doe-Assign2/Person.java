/**
 * A class to model a person, who has a name and an age.
 **/
public class Person {
  private String name;
  private int age;
  private String gender;
  private static int votingAge;
  private static int drivingAge;
  private static int marriageAge;
  private final int INFANT_AGE = 2;
  private final int LOWER_TODDLER_AGE = 1;
  private final int UPPER_TODDLER_AGE = 3;
  private final int LOWER_TEENAGER_AGE = 13;
  private final int UPPER_TEENAGER_AGE = 19;
  private final int CHILD_AGE = 15;
  private final int LOWER_YOUTH_AGE = 15;
  private final int UPPER_YOUTH_AGE = 24;


  // default constructor
  public Person() {
    this("No name yet", 0, "female");
    //setPerson("No name yet", 0);
  }

  // Method that creates adult
  public static Person createAdult(String theName, String theGender) {
    int maxAge = 0;
    if (marriageAge > votingAge && marriageAge > drivingAge) {
      maxAge = marriageAge;
    } else if (votingAge > marriageAge && votingAge > drivingAge) {
      maxAge = votingAge;
    } else {
      maxAge = drivingAge;
    }
    return new Person(theName, maxAge, theGender);
  }
  
  // Checks whether a person is an infant
  public boolean isInfant() {
    if (this.age < INFANT_AGE) {
      return true;
    }
    return false;
  }
  
  // Checks whether a person is a toddler
  public boolean isToddler() {
    if (this.age >= LOWER_TODDLER_AGE && this.age < UPPER_TODDLER_AGE) {
      return true;
    }
    return false;
  }

  // Checks whether a person is a Child
  public boolean isChild(){
    if (this.age < CHILD_AGE && this.age > 0) {
      return true;
    }
    return false;
  }

  // Checks whether a person is a Teenager
  public boolean isTeenager(){
    if (this.age > LOWER_TEENAGER_AGE && this.age < UPPER_TEENAGER_AGE) {
      return true;
    }
    return false;
  }

  // Checks whether a person is a Youth
  public boolean isYouth() {
    if (this.age > LOWER_YOUTH_AGE && this.age < UPPER_YOUTH_AGE) {
      return true;
    }
    return false;
  }

  // constructor that takes a name and an age
  public Person(String n, int a, String g) {
    setPerson(n, a);
    gender = g;
  }

  // accessor method for name
  public String getName() {
    return name;
  }

  // accessor method for age
  public int getAge() {
    return age;
  }

  public String getGender() {
    return gender;
  }

  public String getGenderAsString() {
    return this.gender;
  }

  // accessor method for voting age
  public static int getvotingAge() {
    return votingAge;
  }
  
  // accessor methods for driving age
  public static int getDrivingAge() {
    return drivingAge;
  }

  // accessor method for marriage age
  public static int getMarriageAge() {
    return marriageAge;
  }

  // mutator method for name
  public void setName(String n) {
    name = n;
  }
//Write static methods, setDrivingAge and getDrivingAge, to set and get the driving age. 

  // mutator method for age
  public void setAge(int a) {
    if (a < 0) {
      System.out.println("Age cannot be negative.");
      System.exit(0);
    } else
      age = a;
  }
  

  // mutator method for voting age
  public static void setvotingAge(int v) {
    votingAge = v;
  }

  // mutator method for driving age
  public static void setDrivingAge(int Driveage) {
    drivingAge = Driveage;
  }

  // mutator method for marriage age
  public static void setMarriageAge(int marryage) {
    marriageAge = marryage;
  }
  

  // method to set both the name and the age
  public void setPerson(String n, int a) {
    setName(n);
    setAge(a);
  }

  // tests whether this person is equal to another
  public boolean equals(Person otherP) {
    return (name.equals(otherP.name) && age == otherP.age);
  }

  // tests whether this person has the same name as another
  public boolean hasSameNameAs(Person otherP) {
    return name.equals(otherP.name);
  }

  // tests whether this person has the same age as another
  public boolean hasSameAgeAs(Person otherP) {
    return age == otherP.age;
  }

  // tests hether or not a person can vote, given the voting age. 
  public boolean canVote() {
    if (this.age > votingAge) {
      return true;
    }
    return false;
  }

  // Add a method, canDrive, that returns whether or not a person can drive, given the driving age. 
  public boolean canDrive() {
    if (this.age > drivingAge) {
      return true;
    }
    return false;
  }
  
  // tests hether or not a person can vote, given the voting age. 
  public boolean canMarry() {
    if (this.age > marriageAge) {
      return true;
  }
      return false;
}

  // tests whether this person is older than another
  public boolean isOlderThan(Person otherP) {
    return age > otherP.age;
  }

  // tests whether this person is younger than another
  public boolean isYoungerThan(Person otherP) {
    return age < otherP.age;
  }

  // tests whether a person is an adult
  public boolean isAdult() {
    return (canDrive() && canVote() && canMarry());    
  }
}