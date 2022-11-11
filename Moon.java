/**
 * This class can create a moon object that orbits any exsting planet. 
 * It extends AstronomicalObj so that it can use the methods in its parent class. 
 * @author Mandy Yang
 */
public class Moon extends AstronomicalObj
{
    private Planet p;

    /**
     * This creates a moon object. 
	 * @param distance the distance from the sun to the object.
	 * @param angle the angle (in degrees) that represents how far the planet is around its orbit of the sun.
	 * @param diameter the size of the object.
	 * @param col the colour of this object, as a string. Case insentive. <p>One of: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, 
	 * MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW. Alternatively, a 24 bit hexadecimal string representation of an RGB colour is also accepted, e.g. "#FF0000"</p>
     * @param p the planet object this moon will be orbiting to.
     */
    public Moon(double distance, double angle, int diameter, String col, Planet p)
    {
        super(distance, angle, diameter, col);
        this.p = p;
    }

    /**
     * Draws called instance within the SolarSystem s parameter.
     * @param s teh solar system called instance is about to be drawn in.
     */
    public void draw(SolarSystem s){
        s.drawSolarObjectAbout(this.getDistance(), 
                                this.getAngle(), 
                                this.getDiameter(), 
                                this.getCol(), 
                                p.getDistance(), 
                                p.getAngle());
    }
}