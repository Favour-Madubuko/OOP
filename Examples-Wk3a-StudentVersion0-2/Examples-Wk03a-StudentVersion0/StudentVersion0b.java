import java.util.Scanner;

/**
 * A simple class to represent a student.
 */
public class StudentVersion0b {
  
  private String name;
  private int age;
  
  // read in the name and age of the student
  public void readInformation() {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter the student's name:");
    name = input.next();
    System.out.println("Please enter the student's age:");
    age = input.nextInt();
  }
  
  // display the name and the age of the student
  public void displayInformation() {
    System.out.println("The student's name and age is: " +
                       name + ", " + age);
  }
  
  // An accessor method to return the student's name
  public String getName() {
    return name;
  }
  
  // An accessor method to return the student's age
  public int getAge() {
    return age;
  }
  
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    StudentVersion0b student1 = new StudentVersion0b();
    StudentVersion0b student2 = new StudentVersion0b();
    StudentVersion0b student3 = new StudentVersion0b();
    String catsName;
    int numCupCakes;
        
    student1.readInformation();
    
    student2.readInformation();
    
    student3.readInformation();
    
    System.out.println("Student 1's information: ");
    student1.displayInformation();
    
    System.out.println("Student 2's information: ");
    student2.displayInformation();
    
    System.out.println("Student 3's information: ");
    student3.displayInformation();
    
    catsName = student2.getName();
    System.out.println("My cat's name is now: " + catsName);
    
    numCupCakes = student2.getAge();
    System.out.println("I am going to get " + numCupCakes + " cup cakes for " + catsName);
  }
  
}