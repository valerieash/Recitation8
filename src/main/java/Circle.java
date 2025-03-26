/**
 * This class provides a simple Circle type that
 * creates and tracks instances of circles.
 *
 * @author (You & Me)
 * @version (2019-10-15)
 */
public class Circle
{
    //instance variables
    private Point location;
    private double radius;

    /**
     * Default constructor that initializes an instance of Circle
     * to (0,0) with a radius of 1.0.
     */
    public Circle()
    {
        //TODO: replace this line with your code
    }

    /**
     * Constructor that initializes an instance of Circle to (0,0)
     * with a radius given by the parameter radius.
     *
     * @param radius the radius of this circle.
     */
    public Circle(double radius)
    {
        //TODO: replace this line with your code
    }

    /**
     * Constructor that initializes an instance of Circle to (x,y)
     * with a radius given by the parameter radius.
     *
     * @param location the location of the center of this circle
     * @param radius the radius of this circle.
     */
    public Circle(Point location, double radius)
    {
        //TODO: replace this line with your code
    }

    //accessors
    /**
     * Returns the radius of this circle.
     *
     * @return The radius of this circle.
     */
    public double getRadius()
    {
        //TODO: replace this line and the line below with your code
        return 0.0;
    }

    /**
     * Returns an instance of a Point indicating the location of this circle.
     *
     * @return The location of this circle.
     */
    public Point getLocation()
    {
        //TODO: replace this line and the line below with your code
        return null;
    }

    // mutator methods
    /**
     * Sets the radius of this circle.
     *
     * @param radius The new radius of this circle.
     */
    public void setRadius(double radius)
    {
        //TODO: replace this line with your code
    }

    /**
     * Sets the location of this circle.
     *
     * @param location The new location this circle.
     */
    public void setLocation(Point location)
    {
        //TODO: replace this line with your code
    }

    // other methods
    /**
     * Returns true if the point is in the circle; otherwise false. A point
     * falling on the circle is considered inside the circle.
     *
     * @return true if the point is in the circle; otherwise false
     */
    public boolean contains(Point p)
    {
        //TODO: replace this line and the line below with your code
        return false;
    }

    /**
     * Returns true if the Circle aCircle intersects with this circle;
     * otherwise false.
     *
     * @param aCircle a circle.
     */
    public boolean intersects(Circle aCircle)
    {
        //TODO: replace this line and the line below with your code
        return false;
    }

    /**
     * Returns a string representation of this circle.
     *
     * @return a string representation of this circle.
     */
    public String toString()
    {
        return "Circle/loc="+location+",radius="+radius;
    }
}
