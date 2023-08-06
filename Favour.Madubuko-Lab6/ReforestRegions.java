import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReforestRegions {
    private ArrayList<Region> reforestGhana = new ArrayList<Region>();
    private ArrayList<String> regionsOfGhana = new ArrayList<String>();

    private ArrayList<int> numberOfRegionTrees = new ArrayList<int>();

    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws Exception {
        String filePath = "reforestation.csv";
        File file = new File(filePath);
        Scanner scan = new Scanner(file);
        ArrayList<Region> regionsOfGhana = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Error opening the file: " + file);
            System.exit(0);
        }

        while (scan.hasNextLine())
            System.out.println(scan.nextLine());
        regionsOfGhana.add(scan.next());

        // close Scanner object
        scan.close();
    }

}
