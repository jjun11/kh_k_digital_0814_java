package 매개변수와다형성;

public class Product {
    int price;
    int bonusPoint;
}
class TV extends Product {
    TV() {
        this.price = 100;
        this.bonusPoint = 10;

    }
}
class Compueter extends Product {
    Compueter() {
        this.price = 200;
        this.bonusPoint = 20;
    }
}
class Audio extends Product {
    Audio() {
        this.price = 120;
        this.bonusPoint = 12;
    }
}