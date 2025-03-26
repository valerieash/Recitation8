import java.util.Objects;

/**
 * Represents a 2-dimensional point.
 *
 * @author (Marwan Rasamny)
 * @version (0.1)
 */
public class Point
{
    // fields
    private double x;
    private double y;

    /**
     * Constructor - initializes an instance of Point to (0,0).
     *
     */
    public Point()
    {
        setX(0);
        setY(0);
    }

    /**
     * Constructor - initializes an instance of Point to (x,y).
     *
     */
    public Point(double x, double y)
    {
        setX(x);
        setY(y);
    }

    /**
     * Copy constructor - duplicates the coordinates of aPoint.
     */
    public Point(Point aPoint)
    {
        x = aPoint.x;
        y = aPoint.y;
    }

    // accessor methods

    /**
     * Returns the value of the x coordinate.
     */
    public double getX()
    {
        return x;
    }

    /**
     * Returns the value of the y coordinate.
     */
    public double getY()
    {
        return y;
    }

    /**
     * Returns the distance from the origin to this point.
     */
    public double distanceTo()
    {
        return distanceTo(new Point());
    }

    /**
     * Returns the distance from this point to aPoint.
     */
    public double distanceTo(Point aPoint)
    {
        return Math.sqrt((x-aPoint.x)*(x-aPoint.x) +
                (y-aPoint.y)*(y-aPoint.y));
    }

    //mutators

    /**
     * Sets the x coordinate to the value of x.
     *
     * @param x value of the x coordinate to set.
     */
    public void setX(double x)
    {
        this.x = x;
    }

    /**
     * Sets the y coordinate to the value of y.
     *
     * @param y value of the y coordinate to set.
     */
    public void setY(double y)
    {
        this.y = y;
    }

    /**
     * Changes the x coordinate by dx and the y by dy.
     *
     * @param dx The value by which to change x.
     * @param dy The value by which to change y.
     */
    public void translate(double dx, double dy)
    {
        x += dx;
        y += dy;
    }

    /**
     * Returns the string representation of this point.
     */
    @Override
    public String toString()
    {
        return "("+x+","+y+")";
    }

    /**
     * Returns true if an only if o is an instance of Point and o's x and y
     * values are equal to this Point object's x and y values
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
