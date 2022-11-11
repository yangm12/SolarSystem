/**
 * This class allows user to create a sun in a solar system. 
 * It extends AstronomicalObj so that it can use the methods in its parent class. 
 * @author Mandy Yang
 */
public class Sun extends AstronomicalObj
{
    /**
     * This creates a sun object.
	 * @param distance the distance from the centre of the screen to the sun objetct.
	 * @param angle the angle (in degrees) that represents how far the planet is around its orbit of the sun.
	 * @param diameter the size of the object.
	 * @param col the colour of this object, as a string. Case insentive. <p>One of: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, 
	 * MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW. Alternatively, a 24 bit hexadecimal string representation of an RGB colour is also accepted, e.g. "#FF0000"</p>
     */
    public Sun(double distance, double angle, int diameter, String col){
        super(distance, angle, diameter, col);
    }

    public void draw(SolarSystem s){
        s.drawSolarObject(this.getDistance(), this.getAngle(), this.getDiameter(), this.getCol());
    }
}