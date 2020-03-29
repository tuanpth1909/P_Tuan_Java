package Java_16;

public class Cylinder extends Circle {
    //private instance variables
    private double height;

    //Constructor
    public Cylinder(){
        super();
        this.height = 1.0;
        System.out.println("Constructor a Cylinder with Cylinder()");
    }
    public Cylinder(double height){
        super();
        this.height = height;
        System.out.println("Construced a Cylinder with Cylinder(height)");
    }
    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
        System.out.println("Construced a Cylinder with Cylinder(height, raidus)");
    }
    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
        System.out.println("Construced a Cylinder with Cylinder(height, radius, color)");
    }
    //Get and Set
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    /** Returns the volume of this Cylinder */
    public double getVolume() {
        return getArea()*height;
    }

    //
public String toString(){
    return "this is a Cylinder";
    }
}
