package Java_15;

public class Point {
    //khoi tao bien
    private int x = 0;
    private int y = 0;

    //Constructor
    public Point(){

    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    //Set and Get
    public int getX(){
        return this.x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return this.y;
    }
    public void setY(int y){
        this.y = y;
    }

    //mo ta
    public String toString(){
        return String.format("X: " + x + "Y: " + y);
    }
    public int[] getXY(){
        int[] results = new int[2];
        results[0] = this.x;
        results[1] =this.y;
        return results;
    }

    //SetXY
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(int x, int y){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    public double distance(Point another){
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double distance(){
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }
}
