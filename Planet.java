/**
 * This class would allow you to create a planet object.
 * It extends AstronomicalObj class so that it can use the methods in the parent class.
 */
public class Planet extends AstronomicalObj
{
    /**
     * This creates a planet object.
	 * @param distance the distance from the centre of the screen to the object.
	 * @param angle the angle (in degrees) that represents how far the planet is around its orbit of the sun.
	 * @param diameter the size of the object.
	 * @param col the colour of this object, as a string. Case insentive. <p>One of: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, 
	 * MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW. Alternatively, a 24 bit hexadecimal string representation of an RGB colour is also accepted, e.g. "#FF0000"</p>
     */
    public Planet(double distance, double angle, int diameter, String col){
        super(distance, angle, diameter, col);
    }

    /**
     * Draws this planet in the SolarSystem s that is passed in as a parameter.
     * @param s the solar system this instance is about to be drawn.
     */
    public void draw(SolarSystem s){
        s.drawSolarObject(this.getDistance(), this.getAngle(), this.getDiameter(), this.getCol());
    }
}