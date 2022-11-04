public class Driver{
    public static void main(String[] args) {
        SolarSystem s = new SolarSystem(960, 960);
        Sun sun = new Sun(100);
        sun.draw(s);
        
        Earth earth = new Earth();
        Moon moon = new Moon(earth);

        earth.draw(s);
        moon.draw(s);
        // double eSpeed = moon.getESpeed();
        // double mSpeed = moon.getMSpeed();
        // double mAngle = moon.getMAngle();
        // double eAngle = moon.getEAngle();

        // create a while loop here later and keep drawing and updating the window 
        // sun stays still, earth orbits the sun and moon orbits the earth
        // consider the speed of each planet 
        // maybe create a planet class?
        while(true){
            sun.draw(s);
            earth.draw(s);
            moon.draw(s);    
            earth.move();
            moon.move();
            s.finishedDrawing();
        }
    }
}