public class TestLaptop {
    public static void main(String[] args){
        Laptop laptop1 = new Laptop("MacBook Pro",13.3,"Grey");
        Laptop laptop2 = new Laptop("Lenovo ThinkPad",15,"Black");
        Laptop laptop3 = new Laptop("Lenovo ThinkPad",15,"Black");
        Speaker mySpeaker = new Speaker("Apple X52",Speaker.SpeakerType.STEREO);

        System.out.println("My first laptop is a " +
                            laptop1);
        System.out.println("My second laptop is a " +
                            laptop2);

        if (laptop1.equals(laptop2))
            System.out.println("Laptops 1 & 2 are equal");
        else
            System.out.println("Laptops 1 & 2 are not equal");
    
        if (laptop1.equals(laptop3))
            System.out.println("Laptops 1 & 3 are equal");
        else
            System.out.println("Laptops 1 & 3 are not equal");
        
        if (laptop2.equals(laptop3))
            System.out.println("Laptops 2 & 3 are equal");
        else
            System.out.println("Laptops 2 & 3 are not equal");
    }
}