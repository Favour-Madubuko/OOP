public class TestBus {
    public static void main(String[] args) {
        Person person1 = new Person("Favour", 23, "female");
        Person person2 = new Person("Kofi", 19, "male");
        Person person3 = new Person("Mansah", 2, "female");
        Person person4 = new Person("Bob", 14, "male");
        Person person5 = new Person("Jones", 1, "female");
        Person person6 = new Person("Hannah", 30, "female");
        Person person7 = new Person("Kwame", 20, "male");

        // Testing the constructor
        Bus HIACE = new Bus(5, "XY5", "Toyota", "Toyota HIACE 2014", "White");

        // Testing the accessor methods
        System.out.println("HIACE Bus details: ");
        System.out.println("Bus Capacity: " + HIACE.getbusCapacity());
        System.out.println("License Plate Number: " + HIACE.getlicensePlateNumber());
        System.out.println("Make: " + HIACE.getMake());
        System.out.println("Model: " + HIACE.getModel());
        System.out.println("Colour: " + HIACE.getColour());
        System.out.println("The bus is currently empty " + HIACE.isEmpty());

        // Testing the setDriver and hasDriver Methods
        Person.setDrivingAge(24);
        System.out.println("\nThe HIACE Bus has a driver: " + HIACE.hasDriver());
        System.out.println("Person 4 is now the driver of the HIACE: " + HIACE.setDriver(person4));
        System.out.println("Person 6 is now the driver of the HIACE: " + HIACE.setDriver(person6));
        System.out.println("The HIACE Bus has a driver: " + HIACE.hasDriver());

        // Tesing the addPassenger
        HIACE.addPassenger(person1);
        HIACE.addPassenger(person2);
        HIACE.addPassenger(person3);
        HIACE.addPassenger(person4);
        System.out.println("\nAdding person 5 to the HIACE: " + HIACE.addPassenger(person5));
        System.out.println("Adding person 7 to the HIACE: " + HIACE.addPassenger(person7));

        // Testing the removePassenger
        System.out.println("\nRemoving person 7 from the HIACE: " + HIACE.removePassenger(person7));
        System.out.println("Removing person 1 from the HIACE: " + HIACE.removePassenger(person1));

        // Testing getNumPassengers and getNumOccupants
        System.out.println("\nThere are currently " + HIACE.getNumPassengers() + " passengers in the HIACE");
        System.out.println("There are currently " + HIACE.getNumOccupants() + " occupants in the HIACE");

        // Testing the isEmpty and isFull
        System.out.println("\nThe bus is currently empty " + HIACE.isEmpty());
        System.out.println("The bus is currently full " + HIACE.isFull());
        System.out.println("Adding person 1 to the HIACE: " + HIACE.addPassenger(person1));
        System.out.println("The bus is currently full: " + HIACE.isFull());

        // Testing the listRiders
        System.out.println("\nCurrent riders of the HIACE bus:");
        HIACE.listRiders();

        // Testing the getEmptySeats
        HIACE.removePassenger(person5);
        HIACE.removePassenger(person2);
        HIACE.removePassenger(person1);
        System.out.print("The following seat numbers are empty: ");
        for (int i : HIACE.getEmptySeats()) {
            System.out.print(i + ",");
        }

    }

}
