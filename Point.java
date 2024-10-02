/* CSC 205: <Class 26063> / <Online>
Minilab: <Minilab 5>
Author(s): <Garrett Lambert> & <gar2161746>

Description: The purpose of this code is to provide methods to perform various functions utilizing x and y coordinates. 
The code implements the PointInterface class and provides basic operations for working with 2D points.
*/

public class Point implements PointInterface {

    //----Data-----
    private int x;
    private int y;

    //Constructor
    public Point() {

        this.x = 2;
        this.y = -7;

    }

    //Parameterized Constructor
    public Point(int theX, int theY) {

        this.x = theX;
        this.y = theY;

    }

    //Copy Constructor -- Verifies if value is null and ifso, returns error 
    public Point(Point other) {
        
        if (other == null) {
            throw new IllegalArgumentException("Cannot be null value");
        }

        this.x = other.x;
        this.y = other.y;

    }

    //prints out the (x, y) coordinates in correct formatting
    public String toString() {

        return "(" + this.x + "," + this.y + ")";

    }

    //uses Math.util Math.hypot to perform calculations of how far each point is from another
    @Override
    public double distanceTo(Point otherPoint) {
        
        if ( otherPoint == null ) {
            throw new IllegalArgumentException("Unimplemented method 'distanceTo'");
        }

        double distance = Math.hypot(this.x - otherPoint.x , this.y - otherPoint.y);

        return distance;

    }

    //checks to find if inital point is equal to otherPoint
    @Override
    public boolean equals(Object obj) {

        
        if (this == obj) {
            return true;
        }
        
        if (obj == null || !(obj instanceof Point)) {
            return false;
        }

        Point otherPoint = (Point) obj;
        
        return this.x == otherPoint.x && this.y == otherPoint.y;

    }
    
    //checks to see if point is in correct quadrant, throws error if not. 
    @Override
    public boolean inQuadrant(int quadrant) {
        
        if (quadrant < 1 || quadrant > 4) {
            throw new IllegalArgumentException("Unimplemented method 'inQuadrant'");
        }
        if (quadrant == 1) {
            return x > 0 && y > 0;
        } else if (quadrant == 2) {
            return x < 0 && y > 0;
        } else if (quadrant == 3) {
            return x < 0 && y < 0;
        } else if (quadrant == 4) {
            return x > 0 && y < 0;
        }
        return false;
    }


    //translate the points by adding the xMove and yMove to the initial x and y.
    @Override
    public void translate(int xMove, int yMove) {
        
        this.x += xMove;
        this.y += yMove;
        
    }

   
}