/**
 * This class provides a simple Circle type that
 * creates and tracks instances of circles.
 *
 * @author (You & Me)
 * @version (2019-10-15)
 */
public class Circle {
    //instance variables
    private Point location;
    private double radius;

    /**
     * Default constructor that initializes an instance of Circle
     * to (0,0) with a radius of 1.0.
     */
    public Circle() {
        radius = 1.0;
        location = new Point();
    }

    /**
     * Constructor that initializes an instance of Circle to (0,0)
     * with a radius given by the parameter radius.
     *
     * @param radius the radius of this circle.
     */
    public Circle(double radius) {
        this.radius = radius;
        location = new Point();
    }

    /**
     * Constructor that initializes an instance of Circle to (x,y)
     * with a radius given by the parameter radius.
     *
     * @param location the location of the center of this circle
     * @param radius   the radius of this circle.
     */
    public Circle(Point location, double radius) {
        this.location = new Point(location);
        this.radius = radius;
    }

    //accessors

    /**
     * Returns the radius of this circle.
     *
     * @return The radius of this circle.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Returns an instance of a Point indicating the location of this circle.
     *
     * @return The location of this circle.
     */
    public Point getLocation() {
        return new Point(location);

    }

    // mutator methods

    /**
     * Sets the radius of this circle.
     *
     * @param radius The new radius of this circle.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Sets the location of this circle.
     *
     * @param location The new location this circle.
     */
    public void setLocation(Point location) {
        this.location = new Point(location);
    }

    // other methods

    /**
     * Returns true if the point is in the circle; otherwise false. A point
     * falling on the circle is considered inside the circle.
     *
     * @return true if the point is in the circle; otherwise false
     */
    public boolean contains(Point p) {
        //TODO: replace this line and the line below with your code, if point is in or outsdie the circle, less than or equal to the roadius of the circle then it is in the circle, one liner in the return statment
        // ( calculate distance between two points then get the value) point class method(then compare to radius)
        // how to know if two circles are intersecting
        double px = p.getX() - location.getX();
        double py = p.getY() - location.getY();
        return Math.sqrt(px * px + py * py) <= radius;
    }

    /**
     * Returns true if the Circle aCircle intersects with this circle;
     * otherwise false.
     *
     * @param aCircle a circle.
     */
    public boolean intersects(Circle aCircle) {
        //TODO: replce this line and the line below with your code
        //to know if it intersects, the center of what radius see if it is smaller or the same size
        double distancebetween = location.distanceTo(aCircle.getLocation());
        return distancebetween <= (this.radius + aCircle.getRadius());
    }
        /**
         * Returns a string representation of this circle.
         *
         * @return a string representation of this circle.
         */
        public String toString ()
        {
            return "Circle/loc=" + location + ",radius=" + radius;
        }
    }
