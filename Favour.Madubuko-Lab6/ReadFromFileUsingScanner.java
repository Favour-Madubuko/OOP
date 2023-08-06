import java.io.File;
import java.util.Scanner;

/**
 * @author dadjepon
 * FileWriterDemo1 Class
 * Java Program to illustrate reading from Text File using Scanner Class
 */
public class ReadFromFileUsingScanner {
    public static void main(String[] args) throws Exception {

        // Note: Double backquote is to avoid compiler interpret words
        // like \test as \t (ie. as an escape sequence)
        String filePath = "C:\\Users\\dadjepon\\eclipse-workspace\\gh.edu.ashesi.OOPExample1\\"
                + "src\\gh\\edu\\ashesi\\OOPExample1package\\file.txt";

        // pass the path to the file as a parameter - try with ONLY "output.txt"
        // NB: ensure that either file.txt or output.txt is created before running this code. 
        // What happens when the file does not exist but you run this code? 
        File file = new File(filePath);

        Scanner scan = new Scanner(file);

        while (scan.hasNextLine())
            System.out.println(scan.nextLine());

        //close Scanner object
        scan.close();
    }
}
