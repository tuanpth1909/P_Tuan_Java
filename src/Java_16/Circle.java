package Java_16;

public class Circle {
    //Private instance variables
    private double radius;
    private String color;

    //Constructors
    public Circle(){
        this.radius = 1.0;
        this.color = "red";
        System.out.println("Construced a Circle with Circle()");
    }
    public Circle(double radius){
        this.radius = radius;
        this.color = "red";
        System.out.println("Contruced a Cirlce with Circle(radius)");
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
        System.out.println("Construced a Circle with Circle(radius, color)");
    }

    //SET AND GET
    public double setRadius(){
        return this.radius;
    }
    public void getRadius(double radius){
        this.radius = radius;
    }
    public String setColor(){
        return this.color;
    }
    public void getColor(String color){
        this.color = color;
    }

    //toString
    public String toString(){
        return "Circle[radius = " + radius + ", color = " + color + "]";
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
}
