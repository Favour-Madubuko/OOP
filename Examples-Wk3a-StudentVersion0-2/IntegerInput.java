import java.util.Scanner;
public class IntegerInput {
    private int minimumValue;
    private int maximumValue;
    private String Prompt;

    // The accessor method which ensures the input from the user is between the range of the minimum and maximum values 
    public int getValue() {
        System.out.println(Prompt);
        Scanner input = new Scanner(System.in);
        int Value;
        Value = input.nextInt();
        // The loop continues to run until the user inputs a valid number in-between specified values
        while (Value < minimumValue || Value > maximumValue) {
            System.out.println(
                    "There is an error: please enter a number between " + minimumValue + " and " + maximumValue + "\t");
            Value = input.nextInt();
        }
        return Value;
    }
    // The mutator method which reads various inputs depending on the users choice in the test file
    public void setinputParameters(int newminimumValue, int newmaximumValue, String newPrompt) {
        minimumValue = newminimumValue;
        maximumValue = newmaximumValue;
        Prompt = newPrompt;   
    }
}
/** 2.
 * For my StoneGame this class would have been useful in checking for the maximum number of stones remaining after each user input. It would ensure
 * that the user input after being deducted from the remaining total stones is within range for the next user input. This is
 * especially for the new range (twice the previous user input) that changes depending on alternating user inputs. This class would have
 * been useful by importing and simply calling the methods which will go according to the rules of the game.
 */