
//Importing input-output classes
import java.io.*;

/**
 * @author dadjepon
 * Java program to illustrate Reading from FileReader 
 * using BufferedReader Class
 */
public class ReadFromFileUsingBufferedReader {

    // main driver method
    public static void main(String[] args) throws Exception {

        // Note: Double backquote is to avoid compiler interpret words
        // like \test as \t (ie. as an escape sequence)
        String filePath = "C:\\Users\\dadjepon\\eclipse-workspace\\gh.edu.ashesi.OOPExample1\\"
                + "src\\gh\\edu\\ashesi\\OOPExample1package\\file.txt";

        // pass the path to the file as a parameter - try with ONLY "output.txt"
        // NB: ensure that either file.txt or output.txt is created before running this code. 
        // What happens when the file does not exist but you run this code? 
        File file = new File(filePath);

        // File path is passed as parameter - try "output.txt"
        // NB: BufferedReader automatically overwrite text in file
        // Creating an object of BufferedReader class
        BufferedReader br = new BufferedReader(new FileReader(file));

        // Declaring a string variable
        String str;
        int count = 1;

        // Condition holds true till
        // there is no character in a string
        while ((str = br.readLine()) != null) {

            // Print the string to the screen
            System.out.println(count + ": " + str);
            count++;
        }

        //close the BufferedReader object
        br.close();
    }
}
