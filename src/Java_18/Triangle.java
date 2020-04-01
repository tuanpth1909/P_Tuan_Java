package Java_18;

public class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(String blue, int base, int height){
        super(blue);
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString(){
        return "Triangle[base=" + base + ",height=" + height + "," + super.toString() + "]";
    }

    @Override
    public double getArea(){
        return 0.5*base*height;
    }
}
