public class Point implements PointInterface {

    private int x;
    private int y;


    public Point() {

        this.x = 2;
        this.y = -7;

    }

    public Point(int theX, int theY) {

        this.x = theX;
        this.y = theY;

    }

    public Point(Point other) {
        
        if (other == null) {
            throw new IllegalArgumentException("Cannot be null value");
        }

        this.x = other.x;
        this.y = other.y;

    }

    public String toString() {

        return "(" + this.x + "," + this.y + ")";

    }

    @Override
    public double distanceTo(Point otherPoint) {
        
        if ( otherPoint == null ) {
            throw new UnsupportedOperationException("Unimplemented method 'distanceTo'");
        }

        double distance = Math.hypot(this.x - otherPoint.x , this.y - otherPoint.y);

        return distance;

    }

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
    

    @Override
    public boolean inQuadrant(int quadrant) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inQuadrant'");
    }

    @Override
    public void translate(int xMove, int yMove) {
        // TODO Auto-generated method stub

        //not sure here
        throw new UnsupportedOperationException("Unimplemented method 'translate'");
    }

    



    
}