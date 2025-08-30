
abstract class Car {

    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("...Music playin");
    }
}

abstract class WagonR extends Car {

    public abstract void fly();

    public void drive() {
        // TODO Auto-generated method stub
        System.out.println("driving");

    }

    public void playMusic() {
        // TODO Auto-generated method stub
        System.out.println("Music");
    }

}

class updatedWagonR extends WagonR {

    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("finally flying");

    }

}

public class abstractKeyword {

    public static void main(String[] args) {
        Car obj = new updatedWagonR();
        obj.drive();
        obj.fly();
        obj.playMusic();
    }
}
