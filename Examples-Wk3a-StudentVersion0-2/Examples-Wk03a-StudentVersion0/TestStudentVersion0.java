import java.util.Scanner;

public class TestStudentVersion0 {
 
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    StudentVersion0 student1 = new StudentVersion0();
    StudentVersion0 student2 = new StudentVersion0();
    StudentVersion0 student3 = new StudentVersion0();
    String catsName;
    int numCupCakes;
        
    System.out.println("I'm going to ask you to enter info for student 1.");
    student1.readInformation();
    
    System.out.println();
    System.out.println("I'm going to ask you to enter info for student 2.");
    student2.readInformation();
    
    System.out.println();
    System.out.println("I'm going to ask you to enter info for student 3.");
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