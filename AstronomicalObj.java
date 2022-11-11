/**
 * This class is the parent class of Sun class and Planet class and Asteroids class.
 * Contains get and set methods for every attributes an astronomical object would have.
 * @author Mandy Yang
 */

public class AstronomicalObj 
{
    // some basic attributes of an astronomical object
    private double distance;
    private double diameter;
    private String col;
    private double angle;

    /**
     * Create an astronomical object. 
    * @param distance the distance from the centre of the screen to the astonomical object.
	 * @param angle the angle (in degrees) that represents how far the planet is around its orbit of the sun.
	 * @param diameter the size of the object.
	 * @param col the colour of this object, as a string. Case insentive. <p>One of: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, 
	 * MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW. Alternatively, a 24 bit hexadecimal string representation of an RGB colour is also accepted, e.g. "#FF0000"</p>
     */
    public AstronomicalObj(double distance, double angle, double diameter, String col)
    {
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.col = col;
    }

    /**
     * Set method that can set a new value to diameter filed of the called instance.
     * @param diameter the diameter to be set to an astronomical object
     */
    public void setDiameter(double diameter)
    {
        this.diameter = diameter;
    }

    /**
     * Get diameter of the instance being called.
     * @return the diameter of called instance.
     */
    public double getDiameter() 
    {
        return diameter;
    }

    /**
     * Set the distance of called instance be the value of the parameter.
     * @param d the new value of distance.
     */
    public void setDistance(double d)
    {
        this.distance = d;
    }

    /**
     * Get distance of called instance. 
     * @return distance of called instance.
     */
    public double getDistance()
    {
        return distance;
    }

    /**
     * Set angle of called instance to a.
     * @param a the new value of angle.
     */
    public void setAngle(double a)
    {
        this.angle = a;
    }

    /**
     * Get angle of called instance.
     * @return the angle of called instance. 
     */
    public double getAngle(){
        return angle;
    }

    /**
     * Get colour of called instance.
     * @return the colour of called instance. 
     */
    public String getCol() 
    {
        return col;
    }

    /**
     * set colour of called instance to a new colour.
     * @param col the new colour
     */
    public void setCol(String col) 
    {
        this.col = col;
    }
}