package Point;

public class Point {
    private int x, y;

    public Point(){
        this(0,0);
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(){
        return distance(0,0);
    }

    public double distance(int x, int y){
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public double distance(Point point){
        return point.distance(this.x, this.y);
    }

    public void setX(int x){
        this.x = x;
    }

    public int getX(){
        return this.x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getY(){
        return this.y;
    }
}
