public class Laptop {
    private String model;
    private double screenSize;
    private String colour;

    public Laptop(String model, double screenSize, String colour){
        this.model = model;
        this.screenSize = screenSize;
        this.colour = colour;
    }

    public String getModel(){
        return model;
    }

    public double getScreenSize(){
        return screenSize;
    }

    public String getColour(){
        return colour;
    }

    public String toString(){
        return (colour + " " + model +
                " with a screen of size of " +
                    screenSize + " inches.");
    }

    public boolean equals(Laptop otherLaptop){
        return (this.model.equals(otherLaptop.model) &&
                this.screenSize == otherLaptop.screenSize &&
                this.colour.equals(otherLaptop.colour));
    }
}