package bicycles;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

public class Bicycle {
    private int speed;

    public Bicycle(){
        speed = 0;
    }
    public void accelerate(int speed){
        speed = speed + 5;
    }
    public void brake(int speed){
        speed = speed - 3;
    }
    public int currentSpeed(){
        return speed;
    }
    public void stop(){
        speed = 0;
    }

}
