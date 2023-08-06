public class Square extends Polygon {
    private double side;

    public Square(String name, String colour, double side) {
        super("Square", colour, 4, new double[] { side, side, side, side });
        if (side <= 0) {
            System.out.println("This is invalid. Length must be positive");
        }
        this.side = side;
    }

    public double computeArea() {
        return (side * side);
    }

    public double computePerimeter() {
        return (4 * side);
    }

    public String getDescription() {
        return (getColour());
    }

    public int getNumberOfSides() {
        return numberofSides;
    }

    public void draw() {
        for (int row = 0; row < side; row++) {
            for (int col = 0; col < side; col++) {
                if (row == 0 || row == side || col == 0 || col == side - 1) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Square square = new Square("Square", "red", 4);
        System.out.println(square.getDescription());
        System.out.println("Area: " + square.computeArea());
        System.out.println("Perimeter: " + square.computePerimeter());
        square.draw();

    }

}
