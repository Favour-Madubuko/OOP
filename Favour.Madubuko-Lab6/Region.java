/*This Java Class is for Region of planted Trees */
public class Region {
    private String name;
    private int numberofPlantedTrees;

    public Region(String nameofRegion, int numberofPlantedTrees) {
        this.name = nameofRegion;
        this.numberofPlantedTrees = numberofPlantedTrees;

    }

    // Accessor method for Name
    public String getName() {
        return name;
    }

    // Mutator method for name
    public void setName(String name) {
        this.name = name;
    }

    // Accessor method for numberofPlantedTrees
    public int getNumberofPlantedTrees() {
        return numberofPlantedTrees;
    }

    // Mutator method for numberofPlanted Trees
    public void setNumberofPlantedTrees(int numberofPlantedTrees) {
        this.numberofPlantedTrees = numberofPlantedTrees;
    }

    // The toString() method for the Region Class
    public String toString() {
        return "The Region name is: " + name + " and the Number of planted trees is: " + numberofPlantedTrees;
    }
}