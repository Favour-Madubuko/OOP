import java.util.Scanner;
public class hello {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age1, age2, age3;
        String name1, name2, name3;
        double avgAge;

        System.out.println("Student 1 please enter your name: ");
        name1 = keyboard.next();

        System.out.println("Student 1 please enter your age: ");
        age1 = keyboard.nextInt();

        System.out.println("Student 2 please enter your name: ");
        name2 = keyboard.next();

        System.out.println("Student 2 please enter your age: ");
        age2 = keyboard.nextInt();

        System.out.println("Student 3 please enter your name: ");
        name3 = keyboard.next();

        System.out.println("Student 3 please enter your age: ");
        age3 = keyboard.nextInt();

        avgAge = (age1 + age2 + age3) / (double) 3;
        System.out.println("The Average age is " + avgAge);
    }
}