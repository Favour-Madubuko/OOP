import java.io.FileWriter;
import java.io.IOException;


/*
 * This is a program illustrates what would happen if you try to write to the same file without appending
 * The program reads three command line arguments
 * The last two arguments expected are numbers
 * The first argument should be the word "add" or "multiply"
 * Based on the first argument, the program will write the sum or product of the two numbers to a file
 */
public class WriteToFileDemo2{
    public static final String HELP_COMMAND = "help";
    public static final String ADD_COMMAND = "add";
    public static final String MULTIPLY_COMMAND = "multiply";

    public static void displayHelp() {
        System.out.println("The supported commands are: " + HELP_COMMAND + ", " +
                           ADD_COMMAND + ", " + MULTIPLY_COMMAND);
    }

    public static void doAddition(String[] args) {
        double sum = 0;
        
        try{
            for (int i=1; i<args.length; i++) {
                double num = Double.parseDouble(args[i]);
                sum += num;
            }

            FileWriter outFile = new FileWriter("textfiles/Result.txt");
            outFile.write("The sum of the numbers you entered is: " + sum);
            outFile.close();
        }catch(IOException | NumberFormatException e){
            System.out.println("An exception occured in computing and writing the sum");
            System.out.println("Reason: " + e.getMessage());
        }

      }
      
      public static void doMultiplication(String[] args) {
        double product = 1;

        try{
            for (int i=1; i<args.length; i++) {
                double num = Double.parseDouble(args[i]);
                product *= num;
            }

            FileWriter outFile = new FileWriter("textfiles/Result.txt");
            outFile.write("The product of the numbers you entered is: " + product);
            outFile.close();
        }catch(IOException | NumberFormatException e){
            System.out.println("An exception occured when computing and writing the product");
            System.out.println("Reason: " + e.getMessage());
        }
        
      }
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please specify a command (e.g. add) using a " + 
                               "command-line argument when you run this program.");
        }
        else if (args[0].equalsIgnoreCase(HELP_COMMAND))
            displayHelp();
        else if (args[0].equalsIgnoreCase(ADD_COMMAND))
            doAddition(args);
        else if (args[0].equalsIgnoreCase(MULTIPLY_COMMAND))
            doMultiplication(args); 
        else
            System.out.println("Sorry, I do not understand the command: " + args[0]);
          
        System.out.println("\nGoodbye!");
    }
}