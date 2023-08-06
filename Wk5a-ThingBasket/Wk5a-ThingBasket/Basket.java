/*
 * A class to represent a basket that can hold things.
 */
public class Basket {
    private Thing thing1;
    private Thing thing2;
    private Thing thing3;
    private int numThings;

    public Basket(){
        thing1 = thing2 = thing3 = null;
        numThings = 0;
    }

    public boolean addThing(Thing newThing){
        if (thing1 == null)
            thing1 = newThing;
        else if (thing2 == null)
            thing2 = newThing;
        else if (thing3 == null)
            thing3 = newThing;
        else
            return false;
        
        numThings++;
        return true;
    }

    public void listContents(){
        System.out.println("I have " + numThings + " things in my basket:");
        if (thing1 != null)
            System.out.println(thing1);
        if (thing2 != null)
            System.out.println(thing2);
        if (thing3 != null)
            System.out.println(thing3);
    }

    public static void main(String[] args){
        Basket myBasket = new Basket();
        myBasket.addThing(new Thing("Black","Laptop"));
        myBasket.listContents();
    }
}