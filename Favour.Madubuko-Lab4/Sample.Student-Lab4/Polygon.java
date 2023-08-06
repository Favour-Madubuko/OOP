public abstract class Polygon extends TwoDShape {
    protected int numberofSides;
    protected double[] lengths;

    public Polygon(String name, String colour, int sides, double[] lengths) {
        super(name, colour);
        this.numberofSides = sides;
        this.lengths = lengths;

    }

    public int getNumberOfSides() {
        return numberofSides;
    }

    public double[] getLengths() {
        return lengths;
    }

    public abstract double computeArea();

    public abstract double computePerimeter();

    public abstract void draw();
}
