public class civilservant extends Worker {
    private int age;
    private int Salary;
    private int gratuity;

    /** A constructor */
    public civilservant(String name, int age,
            int inputAge, int inputSalary, int inputGratuity) {
        // Call the constructor of the parent (super) class
        super(name, age);

        // set the additional member variables
        age = inputAge;
        Salary = inputSalary;
        gratuity = inputGratuity;
    }
}
