

public class Sun{

    private double diameter;
    public static SolarSystem s;
    public double speed = 0;
    public double angle = 0;

    public Sun(double diameter){
        // s= new SolarSystem(width, height);
        this.diameter = diameter;
    }

    public SolarSystem getSys(){
        return s;
    }

    public void draw(SolarSystem s){
        s.drawSolarObjectAbout(0, 0, diameter, "YELLOW", 0, 0);  // creating the sun
    }

    // public double getSunSpeed(){
    //     return speed;
    // }

}