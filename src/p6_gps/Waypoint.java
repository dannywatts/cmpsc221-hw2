package p6_gps;

public class Waypoint {
    // Variables
    private double x;
    private double y;
    private int timestamp;

    // Constructors
    public Waypoint() {}
    public Waypoint(double x, double y, int timestamp) {
        this.x = x;
        this.y = y;
        this.timestamp = timestamp;
    }

    // Accessors
    public double getX() {return x;}
    public double getY() {return y;}
    public int getTimestamp() {return timestamp;}

    // Mutators
    public void setX(double x) {this.x = x;}
    public void setY(double y) {this.y = y;}
    public void setTimestamp(int timestamp) {this.timestamp = timestamp;}

    // toString
    @Override
    public String toString() {
        return "(" + x + ", " + y + ") at " + timestamp + " seconds";
    }
}
