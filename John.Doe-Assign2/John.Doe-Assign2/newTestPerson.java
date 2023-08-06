public class newTestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Favour",23,"female");
        Person p2 = new Person("Kofi", 19, "male");
        Person p3 = new Person("Mansah", 2, "female");
        Person p4 = new Person("Bob", 14, "male");
        Person p5 = new Person("Jones", 1, "female");
        
        // Testing the mutator methods
        Person.setvotingAge(19);
        Person.setDrivingAge(17);
        Person.setMarriageAge(23);

        // Testing the accessor methods
        System.out.println("Votin Age: " + Person.getvotingAge());
        System.out.println("Driving Age: " + Person.getDrivingAge());
        System.out.println("Marriange Age: " + Person.getMarriageAge());

        // Testing the canVote() method
        if (p1.canVote())
            System.out.println("p1 can vote.");
        else
            System.out.println("p1 cannot vote.");
        
        if (p4.canVote())
            System.out.println("p4 can vote.");
        else
            System.out.println("p4 cannot vote.");

        
        // Testing the canMarry() method
        if (p1.canMarry())
            System.out.println("p1 can marry.");
        else
            System.out.println("p1 cannot marry.");
        
        if (p3.canMarry())
            System.out.println("p3 can marry.");
        else
            System.out.println("p3 cannot marry.");


         // Testing the canDrive() method
         if (p2.canDrive())
            System.out.println("p2 can drive.");
        else
            System.out.println("p2 cannot drive.");
        
        if (p4.canDrive())
            System.out.println("p4 can drive.");
        else
            System.out.println("p4 cannot drive.");

        // Checking if someone is an adult
        if (p2.isAdult())
            System.out.println("p2 is an adult.");
        else
            System.out.println("p2 is an adult.");
        
        if (p1.isAdult())
            System.out.println("p1 is an adult.");
        else
            System.out.println("p1 is an adult.");
        

        // Creating an adult
        Person adult1 = Person.createAdult("Ebenezer", "Male");
        System.out.print(
                adult1.getName() + " is a " + adult1.getGender() + " adult and is " + adult1.getAge() + " years old.");
        
        // Testing the isInfant method
         if (p5.isInfant())
            System.out.println("p5 is an infant.");
        else
            System.out.println("p5 is not an infant.");
        
        if (p4.isInfant())
            System.out.println("p4 is an infant");
        else
            System.out.println("p4 is not an infant");

        // Testing the isToddler() method
         if (p3.isToddler())
            System.out.println("p3 is a toddler.");
        else
            System.out.println("p3 is not a toddler.");
        
        if (p4.isToddler())
            System.out.println("p4 is a toddler.");
        else
            System.out.println("p4 is not a toddler.");

        // Testing the isChild() method
         if (p4.isChild())
            System.out.println("p4 is a child.");
        else
            System.out.println("p4 is not a child.");
        
        if (p1.isChild())
            System.out.println("p1 is a child.");
        else
            System.out.println("p1 is not a child.");

        // Testing the isTeenager() method
         if (p2.isTeenager())
            System.out.println("p2 is a teenager.");
        else
            System.out.println("p2 is not a teenager.");
        
        if (p3.isTeenager())
            System.out.println("p3 is a teenager.");
        else
            System.out.println("p3 is not a teenager.");

        // Testing the isYouth() method
         if (p2.isYouth())
            System.out.println("p2 is a youth");
        else
            System.out.println("p2 is not a youth.");
        
        if (p5.isYouth())
            System.out.println("p5 is a youth");
            System.out.println("p5 is not a youth.");
        

    }
}
