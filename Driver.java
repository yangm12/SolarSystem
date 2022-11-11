import java.util.ArrayList;

/**
 * This is class contains the main class of this program. 
 * @author Mandy Yang
 */
public class Driver{
    public static void main(String[] args) {
        SolarSystem s = new SolarSystem(1080, 1200);
        
        ArrayList<Planet> planets = new ArrayList<Planet>();
        ArrayList<Moon> moons = new ArrayList<Moon>();
        ArrayList<Asteroids> asteroids1 = new ArrayList<Asteroids>();
        ArrayList<Asteroids> jupiterRing = new ArrayList<Asteroids>();

        // creating the sun and the planets in the solar system
        // put planets in planets array
        Sun sun = new Sun(0, 0, 50, "YELLOW");
        Planet mercury = new Planet(50, 0, 25, "#708090");
        planets.add(mercury);
        Planet venus = new Planet(100, 0, 35, "#FADE7C");
        planets.add(venus);
        Planet earth = new Planet(150, 0, 50, "BLUE");
        planets.add(earth);
        Planet mars = new Planet(200, 0, 50, "#C52C03");
        planets.add(mars);
        Planet jupiter = new Planet(250, 0, 50, "#8B4000");
        planets.add(jupiter);
        Planet saturn = new Planet(300, 0, 50, "#9B7A01");
        planets.add(saturn);
        Planet uranus = new Planet(350, 0, 50, "#0D98BA");
        planets.add(uranus);
        Planet neptune = new Planet(400, 0, 50, "#385504");
        planets.add(neptune);

        Moon moon = new Moon(30, 0, 10, "GREY", earth);

        // adding asteroids to the asteroids belt which is orbiting the sun. 
        for(int i=0; i<180; i++)
        {
            Asteroids a = new Asteroids(225, i*(360/180), 3, "GREY");
            asteroids1.add(a);
        }

        for(int i=0; i<60; i++)
        {
            Asteroids a = new Asteroids(229, 20+i*(360/60), 3, "GREY");
            asteroids1.add(a);
        }

        // adding asteroids to jupiterRing which is orbiting the jupiter.
        for(int i=0; i< 30; i++)
        {
            Asteroids a = new Asteroids(35, 60+i*(360/30), 2, "GREY", jupiter);
            jupiterRing.add(a);
        }

        for(int i=0; i< 30; i++)
        {
            Asteroids a = new Asteroids(30, i*(360/30), 2, "GREY", jupiter);
            jupiterRing.add(a);
        }

        // adding moons to moons array and assign them to their related planets.
        for (int i=0; i<2; i++)
        {
            Moon m = new Moon(35, i*(360/2), 10, "GREY", mars);
            moons.add(m);
        }

        for (int i=0; i<4; i++)
        {
            Moon m = new Moon(35, i*(360/4), 10, "GREY", jupiter);
            moons.add(m);
        }

        for (int i=0; i<9; i++)
        {
            Moon m = new Moon(35, i*(360/9), 10, "GREY", saturn);
            moons.add(m);
        }

        for (int i=0; i<6; i++)
        {
            Moon m = new Moon(35, i*(360/6), 10, "GREY", uranus);
            moons.add(m);
        }

        for (int i=0; i<3; i++)
        {
            Moon m = new Moon(35, i*(360/3), 10, "GREY", neptune);
            moons.add(m);
        }

        moons.add(moon);

        // while true: keep drawing and updating the window 
        // keep on drawing and moving the moons, the planets and the asteroids in arraylists.
        while(true){
            sun.draw(s);
            for(Planet p : planets)
            {
                p.setAngle(0.5+(p.getDistance()/500)+p.getAngle());
                p.draw(s);
            }
            for (Moon m : moons)
            {
                m.setAngle(0.6+(m.getDistance()/500)+m.getAngle());
                m.draw(s);
            }
            for (Asteroids a : asteroids1)
            {
                a.setAngle(0.3+(a.getDistance()/500)+a.getAngle());
                a.draw(s);
            }
            for (Asteroids a : jupiterRing)
            {
                a.setAngle(0.4+(a.getDistance()/500)+a.getAngle());
                a.drawAbout(s);
            }
            
            s.finishedDrawing();
        }
    }
}