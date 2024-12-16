public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.HandleChangeGear(1);
        car1.HandleChangeSpeed(3);
        car1.HandleBrakes(50);

        car2.HandleChangeGear(4);
        car2.HandleChangeSpeed(6);
        car2.HandleBrakes(100);

        car1.PrintState();
        car2.PrintState();
    }
}

class Car {
    int gear = 0;
    int speed = 0;

    void HandleChangeGear(int newGear) {
        gear = newGear;
    }

    void HandleChangeSpeed(int newSpeed) {
        speed = newSpeed;
    }

    void HandleBrakes(int newBrakes) {
        speed = speed - newBrakes;
    }

    void PrintState() {
        System.out.println("speed: " + speed + " current gear: " + gear);
    }
}
