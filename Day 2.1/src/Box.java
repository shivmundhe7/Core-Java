public class Box {
    // State of the box : tight encapsulation
    private double width;
    private double depth;
    private double height;

    // Parameterized constructor to init complete state of box
    public Box(double width, double depth, double height) {
        this.width = width;
        this.depth = depth;
        this.height = height;
    }

    // Behaviour : methods
    // Method to return Box Details in string form
    public String getBoxDimensions() {
        return "Box Dimensions: " + this.width + " x " + this.depth + " x " + this.height;
    }

    // Method to return computed volume of the box
    public double getBoxVolume() {
        return this.width * this.depth * this.height;
    }

    // Testing the class
    public static void main(String[] args) {
        Box b1 = new Box(2.5, 3.0, 4.0);
        System.out.println(b1.getBoxDimensions());
        System.out.println("Volume: " + b1.getBoxVolume());
    }
}
