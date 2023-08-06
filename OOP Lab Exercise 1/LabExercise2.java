import java.util.Scanner;

// Program 2
public class LabExercise2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many classes did you take last semester");
        int n = keyboard.nextInt();
        float total_points = 0;
        float total_credits = 0;

        for (int i = 1; i < n + 1; i++) {
            System.out.println("How many credits was course" + i + "? ");
            float credits = keyboard.nextFloat();
            System.out.println("What was your letter grade?");
            String letter_grade = keyboard.next();
            double points;

            if (letter_grade.equals("A")) {
                points = 4.0;
            } else if (letter_grade.equals("B+")) {
                points = 3.5;
            } else if (letter_grade.equals("B")) {
                points = 3.0;
            } else if (letter_grade.equals("C+")) {
                points = 2.5;
            } else if (letter_grade.equals("C")) {
                points = 2.0;
            } else if (letter_grade.equals("D")) {
                points = 1.5;
            } else {
                points = 0.0;
            }
        total_credits += credits;
        total_points += points*credits;
        }
        float gpa = total_points / total_credits;
        System.out.println("You took " + total_credits + " credits");
        System.out.println("Your semester GPA was " + gpa);
    } 
}
