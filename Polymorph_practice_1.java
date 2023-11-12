
//Write a Java program to create a class Vehicle with a method called speedUp(). Create two subclasses Car and Bicycle. Override the speedUp() method in each subclass to increase the vehicle's speed differently.

class Vehicle {
    int speed;

    void speedUp() {
        speed += 10;
    }

    int speedNext() {
        return speed;
    }
}

class Car extends Vehicle {
    @Override
    void speedUp() {
        super.speedUp();
        System.out.println("speed incrased by 22km/h");
    }
}

class BiCycle extends Vehicle {
    @Override
    void speedUp() {
        super.speedUp();
        System.out.println("speed incrased by 12km/h");
    }
}

public class Polymorph_practice_1 {
    public static void main(String[] args) throws Exception {
        Car car = new Car();
        BiCycle biCycle = new BiCycle();
        car.speedUp();
        biCycle.speedUp();

        System.out.println("after incrase speed");

        System.out.println("car speed now is " + car.speedNext());
        System.out.println("Bicycle Speed now is " + biCycle.speedNext());
    }
}
