package 오버라이딩금지;

public class Car {
    int speed;
    String color;
    String name;
    final void accelerator() {
        System.out.println("차의 속도를 증가시킵니다.");
    }
    final void breakPanel() {
        System.out.println("차의 속도를 감소시킵니다.");
    }
}
class SportsCar extends Car {
    boolean isTurbo;
    SportsCar(String name) {
        isTurbo = false;
        speed = 280;
        this.name = name;
        this.color = "Red";

    }
    int getSpeed() {
        if(isTurbo) return speed *= 1.2;
        return speed;
    }
    public boolean isTurbo() {
        return isTurbo;
    }
    public void setTurbo(boolean turbo) {
        isTurbo = turbo;
    }
    void infoCar() {
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + getSpeed());
        System.out.println("색상: " + color);
        System.out.println("xjqhahem : " +isTurbo);

    }
}
