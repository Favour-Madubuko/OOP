/*
 * A class to represent a basket that can hold things.
 */
public class BasketV2 {
    private Thing[] things;
    private int numThings;

    public BasketV2(){
        things = new Thing[10];
        numThings = 0;
    }

    public boolean addThing(Thing newThing){
        if (numThings < things.length){
            things[numThings] = newThing;
            numThings++;
            return true;
        }
        else 
            return false;
    }

    public void listContents(){
        System.out.println("I have " + numThings + " things in my basket:");
        for(int i=0; i<numThings; i++){
            System.out.println(things[i]);
        }
    }
    public boolean contains (Thing thingToFind){
        for (int i=0; i<numThings; i++){
            if(things[i].equals(thingToFind))
            return true;
        }
        return false;
    }

    
    public static void main(String[] args){
        BasketV2 myBasket1 = new BasketV2();
        myBasket1.addThing(new Thing("Black","Laptop"));
        myBasket1.addThing(new Thing("Red","Phone"));
        myBasket1.addThing(new Thing("Silver","Tablet"));
        myBasket1.addThing(new Thing("Blue", "Phone"));
        myBasket1.addThing(new Thing("Black","Laptop"));
        myBasket1.addThing(new Thing("Red","Phone"));
        myBasket1.addThing(new Thing("Silver","Tablet"));
        myBasket1.addThing(new Thing("Blue", "Phone"));
        myBasket1.addThing(new Thing("Black","Laptop"));
        myBasket1.addThing(new Thing("Red","Phone"));
        myBasket1.addThing(new Thing("Silver","Tablet"));
        myBasket1.addThing(new Thing("Blue","Phone"));

        BasketV2 myBasket2 = new BasketV2();
        myBasket2.addThing(new Thing("Yellow","Banana"));
        myBasket2.addThing(new Thing("Red","Apple"));
        myBasket2.addThing(new Thing("Green","Pawpaw"));
        myBasket2.addThing(new Thing("Orange", "Orange"));
        myBasket2.addThing(new Thing("Dark", "Pear"));
        myBasket2.addThing(new Thing("White", "Coconut"));
        myBasket2.addThing(new Thing("Green", "Pepper"));
        myBasket2.addThing(new Thing("Orange", "Orange"));
        myBasket2.addThing(new Thing("Dark", "Pear"));
        myBasket2.addThing(new Thing("White", "Coconut"));
        

        System.out.println("Contents of Basket 1:");
        myBasket1.listContents();

        System.out.println();
        System.out.println("Contents of Basket 2:");
        myBasket2.listContents();


        

    }
}