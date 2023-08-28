package 자동차만들기;

public class SportsCar extends Vehicle{
    SportsCar(String name) {
        super(name);
        speed = 250;
        fuel = 8;
        oiltank = 30;
        seat = 2;

    }
    public void addON(boolean onOff) {
        if(onOff) speed = (int)(speed * 1.2);
    }
}
