/*
 * A class to represent an object with a name and colour.
 */
public class Thing {
    private String colour;
    private String name;
    private static int numThingsCreated = 0;

    public Thing(String colour, String name){
        this.colour = colour;
        this.name = name;
        numThingsCreated++;
    }

    public Thing(String name){
        this.colour = "Clear";
        this.name = name;
        numThingsCreated++;
    }

    public String getColour(){
        return colour;
    }

    public String getName(){
        return name;
    }

    public void setColour(String newColour){
        this.colour = newColour;
    }

    public static int getNumThingsCreated(){
        return numThingsCreated;
    }
    
    public String toString(){
        return colour + " " + name;
    }
    
    public static void main(String[] args){
        Thing t1 = new Thing("Bag");
        Thing t2 = new Thing("Red","Bag");
        Thing t3 = new Thing("Black","Laptop");
        Thing t4 = t2;
        Thing t5 = new Thing("Red","Bag");
        
        System.out.println("I have created " +
                            Thing.getNumThingsCreated() + 
                            " things:");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
    }
}