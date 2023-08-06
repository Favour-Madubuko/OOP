public class Bus {
    private int busCapacity;
    private String busLicensePlateNumber;
    private String busMake;
    private String busModel;
    private String busColour;
    private Person driver;
    private Person[] passengers;
    private int numberOfPassengers;

    public Bus(int capacityOfBus, String plateNumber, String theMake, String theModel, String theColour) {
        this.driver = null;
        this.busCapacity = capacityOfBus;
        this.busLicensePlateNumber = plateNumber;
        this.busMake = theMake;
        this.busModel = theModel;
        this.busColour = theColour;
        this.numberOfPassengers = 0;
        this.passengers = new Person[capacityOfBus];
    }

    // Accessor methods for the bus capacity, license plate number, make, model and
    // colour.
    public int getbusCapacity() {
        return busCapacity;
    }

    public String getlicensePlateNumber() {
        return busLicensePlateNumber;
    }

    public String getMake() {
        return busMake;
    }

    public String getModel() {
        return busModel;
    }

    public String getColour() {
        return busColour;
    }

    public boolean setDriver(Person aDriver) {
        if (aDriver.canDrive()) {
            this.driver = aDriver;
            return true;
        }
        return false;
    }

    public boolean hasDriver() {
        return (this.driver != null);
    }

    public boolean addPassenger(Person addedPassenger) {
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] == null) {
                passengers[i] = addedPassenger;
                this.numberOfPassengers += 1;
                return true;
            }
        }
        return false;

    }

    public boolean removePassenger(Person removedPassenger) {
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i].equals(removedPassenger)) {
                passengers[i] = null;
                this.numberOfPassengers -= 1;
                return true;
            }
        }
        return false;
    }

    public int getNumPassengers() {
        return (this.numberOfPassengers);
    }

    public int getNumOccupants() {
        if (driver == null) {
            return numberOfPassengers;
        }
        return numberOfPassengers + 1;
    }

    public boolean hasPassengers() {
        return (numberOfPassengers > 0);
    }

    public boolean isEmpty() {
        return (driver == null && numberOfPassengers == 0);
    }

    public boolean isFull() {
        return (numberOfPassengers + 1 == getNumOccupants());
    }

    public void listRiders() {
        if (hasDriver()) {
            System.out.println(
                    "Driver: " + driver.getName() + " (" + driver.getGender() + ", " + driver.getAge() + " years old)");
        } else {
            System.out.println("There is no driver");
        }
        if (hasPassengers()) {
            for (int i = 0; i < busCapacity; i++) {
                if (passengers[i] != null) {
                    System.out.println("Passenger " + (i + 1) + ": " + passengers[i].getName() + " ("
                            + passengers[i].getGender() + ", " + passengers[i].getAge() + ")");
                }
            }
        } else {
            System.out.println("There is no passenger");
        }
    }

    public int[] getEmptySeats() {
        int[] emptySeats = new int[busCapacity - numberOfPassengers];
        int seat = 0;
        for (int i = 0; i < busCapacity; i++) {
            if (passengers[i] == null) {
                emptySeats[seat] = i;
                seat++;
            }
        }
        return emptySeats;
    }
}
