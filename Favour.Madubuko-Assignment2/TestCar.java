public class TestCar {
    public static void main(String[] args) {
        //Person class objects
        Person firstPersonPassenger = new Person("Dad", 34, "M");
        Person secondPersonPassenger = new Person("K.B", 27, "M");
        Person thirdPersonPassenger = new Person("Favour", 30, "F");
        Person fourthPersonPassenger = new Person("CJ", 18, "M");
        Person fifthPersonPassenger = new Person("Mum", 23, "F");
        
        //Initialized Car class for jeep
        Car jeep = new Car(firstPersonPassenger);
        jeep.addPassenger(firstPersonPassenger);

        //Initialized Car class for prado
        Car prado = new Car();

        //Initialized Car class for ferari
        Car ferari = new Car();
        
        //Testing for right drivers age
        System.out.println(fourthPersonPassenger);

        //For addition of passengers
        ferari.setDriver(firstPersonPassenger);
        ferari.addPassenger(secondPersonPassenger);
        ferari.addPassenger(thirdPersonPassenger);
        ferari.addPassenger(fourthPersonPassenger);
        ferari.addPassenger(fifthPersonPassenger);

        //Test case for Drivers
        System.out.println("It is " + jeep.hasDriver() + " that jeep has a driver\n");
        System.out.println("It is " + prado.hasDriver() + " that prado has a driver\n");

        //Test case for Passengers
        System.out.println("It is " + jeep.hasPassengers() + " that jeep has at least 1 passenger\n");
        System.out.println("It is " + prado.hasPassengers() + " that prado has at least 1 passenger\n");

        //Test case for Empty car
        System.out.println("It is " + jeep.isEmpty() + " that jeep has no passenger\n");
        System.out.println("It is " + prado.isEmpty() + " that prado has no passenger\n");

        //Test case for Full car
        System.out.println("It is " + ferari.isFull() + " that the ferari is full\n");
        System.out.println("It is " + jeep.isFull() + " that the jeep is full\n");

        //Test for Number of Occupants
        System.out.println("Jeep has " + jeep.getNumOccupants() + " occupants\n");
        System.out.println("Ferari has " + ferari.getNumOccupants() + " occupants\n");
        
        //Test for list riders
        ferari.listRiders();
        jeep.listRiders();
        prado.listRiders();

        //Set Age
        System.out.println("Set age" + ferari.getNumOccupants() + " occupants\n");


    }
    
}
