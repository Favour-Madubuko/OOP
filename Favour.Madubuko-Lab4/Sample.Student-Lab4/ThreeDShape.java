public abstract class ThreeDShape extends Shape {

    public ThreeDShape(String name, String colour) {
        super(name, colour, true);
    }

    public abstract double computeVolume();

    public abstract double computeSurfaceArea();
}
