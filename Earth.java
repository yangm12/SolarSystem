public class Earth extends Sun{
    private double diameter = 70;
    public double speed = 3;
    public double angle = 0;
    // public SolarSystem

    public Earth(){
        super(100);
    }
    
    public double getESpeed(){
        return speed;
    }

    public double getEAngle(){
        return angle;
    }

    public void draw(SolarSystem s){
        s.drawSolarObject(150, angle, diameter, "BLUE");

    }

    public double getAngle(){
        return angle;
    }

    public double getSpeed(){
        return speed;
    }

    public void move(){
        // if(angle<360){
        //     angle = angle + speed;
        // }else{
        //     angle =0;
        // }
        angle = angle + speed;

    }
}