import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

/** 
 * This is a program that reads two text files, one containing 
 * arbitrary strings, and another containing integers, and prints
 * their contents to the screen.
 */
public class ReadFileDemo {
 
  public static void main(String[] args) {
    
    // Declare strings to hold the file names
    String stringsFileName = "textfiles/demo_file_strings.txt";
    String intsFileName = "textfiles/demo_file_ints.txt";
    
    // Create file objects corresponding to the files we want
    // to read
    File stringsFile = new File(stringsFileName);
    File intsFile = new File(intsFileName);
    
    // Declare Scanner variables to help read from the 
    // files that we want to read, but don't create the scanner
    // objects yet.
    Scanner stringsFileInput = null;
    Scanner intsFileInput = null;
    
    // try to open the strings file for reading
    try {
      stringsFileInput = new Scanner(stringsFile);
    }
    catch (FileNotFoundException e) {
      System.out.println("Error opening the file: " + stringsFile);
      System.exit(0);
    }
    

    // try to open the ints file for reading
    try {
      intsFileInput = new Scanner(intsFile);
    }
    catch (FileNotFoundException e) {
      System.out.println("Error opening the file: " + intsFile);
      System.exit(0);
    }
    
    // read the contents of the strings file
    System.out.println("The file '" + stringsFileName + 
                       "' has the following contents: ");
    while (stringsFileInput.hasNextLine()){
      String line = stringsFileInput.nextLine();
      System.out.println(line.length() + ": " + line);
    }
    System.out.println();

    // read the contents of the ints file
    System.out.println("The file '" + intsFileName + 
                       "' has the following contents: ");
    int sum = 0;
    int numberOfNums = 0;
    double average;
    while (intsFileInput.hasNext()){
        int num = intsFileInput.nextInt();
        System.out.print(num + ", ");
        numberOfNums++;
        sum += num;
    }
    average = sum / (double) numberOfNums;
    System.out.println("I read " + numberOfNums + " numbers.");
    System.out.println("Their sum is: " + sum);
    System.out.println("Their average is: " + average);
    
    System.out.println();

  }
}