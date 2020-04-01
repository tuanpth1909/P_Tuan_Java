package Java_18;

public class Shape {
    private String color;

    //Constructor
    public Shape(String color){
        this.color = color;
    }

    @Override
    public String toString(){
        return "Shape[color=" + color + "]";
    }
    //getString

    public double getArea(){
        System.err.println("Shape unknow! Cannot compute area");
        return 0;
    }
}
