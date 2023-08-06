import java.util.Scanner;

// Program 1
public class Lab_Exercise1 {
    public static void main(String[] args) {
        System.out.println("Enter a list of positive numbers, one per line.");
        System.out.println("Use a negative number to indicate the end of input");

        Scanner keyboard = new Scanner(System.in);
        int num;
        num = keyboard.nextInt();
        int even = 0;
        int odd = 0;
        int zeros = 0;
        while (num >= 0) {
            if (num == 0) {
                zeros += 1;
            } else if (num % 2 == 0) {
                even += 1;
            } else {
                odd += 1;

            }
            num = keyboard.nextInt();
        }

        System.out.println("Thank you!");
        System.out.println("You entered " + even + "even numbers and " + odd + "odd numbers and " + zeros + " zeros");
        
        
    }

    
}