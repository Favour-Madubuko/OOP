public class practiceinherit {
    double length;
    double height;
    double width;

    practiceinherit() {
        this.length = -1;
        this.height = -1;
        this.width = -1;

    }

    practiceinherit(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }
    
    practiceinherit(practiceinherit old) {
        this.length = old.length;
        this.height = old.height;
        this.width = old.width;

    }
    
    public void information() {
        System.out.println("Running the box");
    }
}
