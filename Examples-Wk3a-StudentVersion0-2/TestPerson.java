public class TestPerson {

    public static void main(String[] args) {

        // The person class is called
        Person favour = new Person();

        // setPerson takes in arguments from the Person class and displays 
        favour.setPerson("Favour", 19, "m");

        // getName data (accessor method) from the mutator method is displayed
        System.out.println(favour.getName());

        //getAge data (accessor method) from the mutator method is displayed
        System.out.println(favour.getAge());

        //getGender data (accessor method) from the mutator method is displayed
        System.out.println(favour.getGender());

        // Name is changed from the accessor method by the mutator method, then displayed
        favour.setName("Dr. A");
        System.out.println(favour.getName());

        // Age is changed from the accessor method by the mutator method, then displayed
        favour.setAge(32);
        System.out.println(favour.getAge());

        // Gender is changed from the accessor method by the mutator method, then displayed
        favour.setGender("F");
        System.out.println(favour.getGender());

        // setPerson takes in arguments but this exits due to incorrect input 
        favour.setPerson("Hereford", -23, "males");
    }

   
}
