import java.util.Scanner;

public class StudentVersion0 {
  
  private String name;
  private int age;
  
  public void readInformation() {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter the student's name:");
    name = input.next();
    System.out.println("Please enter the student's age:");
    age = input.nextInt();
  }
  
  public void displayInformation() {
    System.out.println("The student's name and age is: " +
                       name + ", " + age);
  }
  
  public String getName() {
    return name;
  }
  
  public int getAge() {
    return age;
  }
}