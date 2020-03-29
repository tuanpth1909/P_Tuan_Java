package Java_07;

public class Point {
    private int x, y;
     //The contructors
    public Point(){
        this.x = 0;
        this.y = 0;
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    //The public set and get
    public int getX(){
        return this.x;
    }
    public int setX(int x){
        return this.x = x;
    }
    public int getY(){
        return this.y;
    }
    public int setY(int y){
        return this.y = y;
    }
    //Return "(x,y)"
    public String toString(){
        return "(" + this.x + "," + this.y +")";
    }
    //Return a 2-elenment int array containing x and y
    public int [] getXY(){
        int[] results = new int[2];
        results[0] = this.x;
        results[1] = this.y;
        return results;
    }
    //Set both and y
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    //Return the distance from this instance to the given point at (x,y).
    public double distance(int x, int y){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    //Return the distance from this instance to the given Poin instance
    public double distance(Point another){
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    //Return the distance from this instance to (0,0)
    public double distance(){
        return Math.sqrt(this.x*this.x + this.y*this.y);

    }
}
