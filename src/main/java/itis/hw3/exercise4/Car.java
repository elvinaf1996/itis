package itis.hw3.exercise4;

//4) Создать класс «Сar», у которого будут два свойства и два метода (например, разогнаться и остановиться).
//класс сделала абстрактным, тк машина это что-то общее

public abstract class Car {

    private int velocity;
    private Transmission transmission;

    public Car(int velocity, Transmission transmission) {
        this.velocity = velocity;
        this.transmission = transmission;
    }

    public Car() {
        this.velocity = 0;
        this.transmission = Transmission.NEUTRAL;
    }

    public void accelerate(int newVelocity) {
        if (newVelocity < velocity) {
            throw new IllegalArgumentException("Для разгона нужна скорость большая, чем текущая");
        }

        velocity = newVelocity;
    }

    public void shiftIIntoGear(Transmission newTransmission) {
        transmission = newTransmission;
    }

    public void stop() {
        velocity = 0;
    }
}