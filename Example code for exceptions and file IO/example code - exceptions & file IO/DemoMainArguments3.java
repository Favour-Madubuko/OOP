
public class DemoMainArguments3 {
  
  public static final String HELP_COMMAND = "help";
  public static final String ADD_COMMAND = "add";
  public static final String MULTIPLY_COMMAND = "multiply";
  
  public static void main(String[] args) {
    
    if (args.length == 0) {
      System.out.println("Please specify a command (e.g. help) using a " + 
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
  

  public static void displayHelp() {
    System.out.println("The supported commands are: " + HELP_COMMAND + ", " +
                       ADD_COMMAND + ", " + MULTIPLY_COMMAND);
  }
  
  public static void doAddition(String[] args) {
    if (args.length < 3)
      System.out.println("Please enter at least 2 or more numbers.");
    else {
      double sum = 0;
    
      for (int i=1; i<args.length; i++) {
        try {
          double num = Double.parseDouble(args[i]);
          sum += num;
        } catch (NumberFormatException e) {
          //System.out.print("Ignoring the input argument: " + args[i]);
          //System.out.println(", due to the exception: " + e.toString());
        } 
      }
      
      System.out.println();
      System.out.println("The sum of the numbers you entered is: " + sum);
    }
  }
  
  public static void doMultiplication(String[] args) {
    if (args.length < 3)
      System.out.println("Please enter at least 2 or more numbers.");
    else {
      double product = 1;
    
      for (int i=1; i<args.length; i++) {
        try {
          double num = Double.parseDouble(args[i]);
          product *= num;
        } catch (NumberFormatException e) {
          System.out.print("Ignoring the input argument: " + args[i]);
          System.out.println(", due to the exception: " + e.toString());
        }
      }
      
      System.out.println();
      System.out.println("The product of the numbers you entered is: " + product);
      
    }
  }
}