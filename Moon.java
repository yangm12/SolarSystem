public class Moon extends Earth{
    private double diameter = 50;
    public double speed = 1;
    public double angle = 10;
    private Earth planet;

    public Moon(Earth planet){
        super();
        this.planet=planet;
    }

    public double getMSpeed(){
        return speed;
    }

    public double getMAngle(){
        return angle;
    }

    public void draw(SolarSystem s){

        s.drawSolarObjectAbout(300, this.planet.getAngle(), diameter, "GREY", 10,  angle);
    }

    public void move(){
        if(angle<360){
            angle = angle + speed;
        }else{
            angle =0;
        }
    }
}