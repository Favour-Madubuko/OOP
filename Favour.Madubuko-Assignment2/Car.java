public class Car {
    Person Driver = new Person();
    Person frontSeatPassenger = new Person();
    Person backSeatPassenger1 = new Person();
    Person backSeatPassenger2 = new Person();
    Person backSeatPassenger3 = new Person();
    String licencePlateNumber;

    //A default constructor that sets the instance variable for the driver and all passengers to null
    public Car() {
        this.Driver = null;
        this.frontSeatPassenger = null;
        this.backSeatPassenger1 = null;
        this.backSeatPassenger2 = null;
        this.backSeatPassenger3 = null;
      }

    //A constructor that takes in a reference to a Person object representing the driver and checks for the right age
    public Car(Person Driver){
        if (Driver.getAge() < 18) {
            System.out.println("Your age is below the limit of above 18");
            System.exit(0);   
        }
        this.Driver = Driver;
        this.frontSeatPassenger = null;
        this.backSeatPassenger1 = null;
        this.backSeatPassenger2 = null;
        this.backSeatPassenger3 = null;
    }
    //A method hasDriver() which returns a boolean indicating whether or not the car currently has a driver.
    public boolean hasDriver() {
        return (this.Driver != null);
    }
    //A method hasPassengers() which returns whether or not the car has at least one passenger
    public boolean hasPassengers() {
        return this.frontSeatPassenger != null || this.backSeatPassenger1 != null || this.backSeatPassenger2 != null
                || this.backSeatPassenger3 != null;
    }
    //A method isEmpty() which returns whether or not the car is empty (has no driver or passengers
    public boolean isEmpty() {
        return this.frontSeatPassenger == null && this.backSeatPassenger1 == null && this.backSeatPassenger2 == null
            && this.backSeatPassenger3 == null && this.Driver == null;
    }
    //A method isFull() which returns whether or not the car is full (all spots for the driver and passenger are taken)
    public boolean isFull() {
        return this.frontSeatPassenger != null && this.backSeatPassenger1 != null && this.backSeatPassenger2 != null
                && this.backSeatPassenger3 != null && this.Driver != null;
    }

    //A method setDriver() which takes as input a reference to a Person object. If the person is above 18, the car’s driver is set, 
    //replacing any driver that was there previously.The method then returns true.  Otherwise, it returns false.
    public boolean setDriver(Person Driver) {
        if (Driver.getAge() > 18) {
            this.Driver = Driver;
            return true;
        }
        else{
            return false;
        }
    }

    /*A method addPassenger() that takes as input a reference to a Person object. 
    The method tries to put the passenger in one of the passenger slots (frontSeatPassenger, 
    backSeatPassenger1, backSeatPassenger2, or backSeatPassenger3) and returns whether or not it was successful in doing so.  
    A passenger can be successfully added only if there’s an empty passenger slot.*/
    public boolean addPassenger(Person Passenger) {
        if (this.frontSeatPassenger == null) {
            this.frontSeatPassenger = Passenger;
            return true;
        }
        if (this.backSeatPassenger1 == null) {
            this.backSeatPassenger1 = Passenger;
            return true;
        }
        if (this.backSeatPassenger2 == null) {
            this.backSeatPassenger2 = Passenger;
            return true;
        }
        if (this.backSeatPassenger3 == null) {
            this.backSeatPassenger3 = Passenger;
            return true;
        }
        return false;
    }

    public int getNumOccupants() {
        int count = 0;
        if (this.Driver != null) {
            count++;
        }
        if (this.frontSeatPassenger != null) {
            count++;
        }
        if (this.backSeatPassenger1 != null) {
            count++;
        }
        if (this.backSeatPassenger2 != null) {
            count++;
        }
        if (this.backSeatPassenger3 != null) {
            count++;
        }
        return count;

    }

    //A method listRiders() which displays the name and age of the driver and 
    //each of the passengers in the car, as well as where they are sitting (front or back seat).
    public void listRiders() {
        if (this.Driver != null) {
            System.out.println("The name of the driver is " + this.Driver.getName()
                    + " and he is " + this.Driver.getAge() + " years old.");
        }
        if (this.frontSeatPassenger != null) {
            System.out.println("The name of the front seat passenger is " + this.frontSeatPassenger.getName()
                    + " and he is " + this.frontSeatPassenger.getAge() + " years old.");
        }
        if (this.backSeatPassenger1 != null) {
            System.out.println("The name of first back seat passenger is " + this.backSeatPassenger1.getName()
                    + " and he is " + this.backSeatPassenger1.getAge() + " years old.");
        }
        if (this.backSeatPassenger2 != null) {
            System.out.println("The name of the second back seat passenger is " + this.backSeatPassenger2.getName()
                    + " and he is " + this.backSeatPassenger2.getAge() + " years old.");
        }
        if (this.backSeatPassenger3 != null) {
            System.out.println("The name of the third back seat passenger is " + this.backSeatPassenger3.getName()
            + " and he is " + this.backSeatPassenger3.getAge() + " years old.\n");
        }
    }
}
