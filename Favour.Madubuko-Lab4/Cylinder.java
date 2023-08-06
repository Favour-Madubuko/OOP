import java.lang.Math;

public class Cylinder extends ThreeDShape {
    private double radius;
    private double height;

    public Cylinder(String colour, double radius, double height) {
        super("Cylinder", colour);
        this.radius = radius;
        this.height = height;
    }

    public String getDescription() {
        return ("Colour: " + getColour() + ", radius: " + radius + " , height: " + height);
    }

    public double computeVolume() {
        return (height * Math.PI * Math.pow(radius, 2));
    }

    public double computeSurfaceArea() {
        return (4 * Math.PI * Math.pow(radius, 2)) + (4 * Math.PI * radius * height);
    }

    public static void main(String[] args) {
        Cylinder cyl = new Cylinder("red", 7, 6);
        System.out.println(cyl.getDescription());
        System.out.println("Volume: " + cyl.computeVolume());
        System.out.println("Surface Area: " + cyl.computeSurfaceArea());

    }
}
