import java.util.*;
public class TestIntegerInput {
    // Takes input from the IntegerInput class and tests various values based on the input
    public static void main(String[] args) {
        IntegerInput test = new IntegerInput();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello, welcome to the minimum and maximum number checker");
        System.out.println("Please enter a minimum number to check");
        int minimum = keyboard.nextInt();
        System.out.println("Please enter a maximum number to check");
        int maximum = keyboard.nextInt();
        test.setinputParameters(minimum, maximum, "Enter a number between the minimum number and maximum number inputed");
        test.getValue();
    }
}
