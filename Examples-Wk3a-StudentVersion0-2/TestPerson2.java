/*This program is written as a Test Case to the constructors, objects and references created in the Person class. */
public class TestPerson2 {
    public static void main(String[] args) {
    // The person class is called
        Person favour = new Person();
        Person firstPerson = new Person("Madu F",13,"Male");
        Person secondPerson = new Person("Dr. A",41,"Female");
        Person thirdPerson = new Person("Kwab B",27,"M");
        Person fourthPerson = new Person("David D", 27, "M");
        Person fifthPerson = new Person("Kwab B",27,"F");
        System.out.println(firstPerson);
        System.out.println(favour);

    //Test whether two Person objects are equal (have the same name and age)
    System.out.println("It is " + thirdPerson.equals(fifthPerson) + " that the third person's name and age is same as the fifth person's");
    System.out.println("It is " + secondPerson.equals(fourthPerson) + " that the second person's name and age is same as the fourth person's");

    
    //Test whether two Person objects have the same name
    System.out.println("It is " + thirdPerson.sameName(fifthPerson) + " that the third person's name is same as the fifth person's");
    System.out.println("It is " + secondPerson.sameName(firstPerson) + " that the second person's name is same as the first person's");
        
    
    // Test whether two Person objects are the same age
    System.out.println("It is " + thirdPerson.sameAge(fourthPerson) + " that the third person's age is same as the fifth person's");
    System.out.println("It is " + firstPerson.sameAge(fifthPerson) + " that the first person's name is same as the fifth person's");
    
        
    // Test whether one Person object is older than another
    System.out.println("It is " + fifthPerson.older(firstPerson) + " that the fifth person is older than the first person");
    System.out.println("It is " + fourthPerson.older(secondPerson) + " that the fourth person is older than the second person");

    
    //Test whether one Person object is younger than another
    System.out.println("It is " + firstPerson.younger(thirdPerson) + " that the first person is younger than the third person");
    System.out.println("It is " + secondPerson.younger(fifthPerson) + " that the second person is younger than the fifth person");
}


}
