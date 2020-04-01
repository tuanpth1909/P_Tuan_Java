package Java_19;

abstract public class Shape {
    // Private member variable
    private String color;

    /** Constructs a Shape instance with the given color */
    public Shape (String color) {
        this.color = color;
    }

    /** Returns a self-descriptive string */
    @Override
    public String toString() {
        return "Shape[color=" + color + "]";
    }

    /** All Shape's concrete subclasses must implement a method called getArea() */
    abstract public double getArea();
}
