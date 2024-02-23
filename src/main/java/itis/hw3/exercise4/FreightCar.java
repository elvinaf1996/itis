package itis.hw3.exercise4;

//Используя наследованные, реализовать класс «Грузовой автомобиль»
//Добавь по одному свойству и одному методу.

import static java.lang.String.format;

public class FreightCar extends Car {

    private final int LOAD_CAPACITY;
    private int workload;

    public FreightCar(int loadCapacity) {
        super(0, Transmission.NEUTRAL);
        this.LOAD_CAPACITY = loadCapacity;
        this.workload = 0;
    }

    public FreightCar(int velocity, Transmission transmission, int loadCapacity, int workload) {
        super(velocity, transmission);
        this.LOAD_CAPACITY = loadCapacity;
        this.workload = workload;
    }

    public FreightCar(int loadCapacity, int workload) {
        this.LOAD_CAPACITY = loadCapacity;
        this.workload = workload;
    }

    public void loadTheCar(int amountOfCargo) {
        if (amountOfCargo > LOAD_CAPACITY) {
            throw new IllegalArgumentException(format("Не могу загрузить '%s' кг тк максимальная грузоподъемность авто '%s'", amountOfCargo, LOAD_CAPACITY));
        }

        if (workload + amountOfCargo > LOAD_CAPACITY) {
            throw new IllegalArgumentException(format("Не могу загрузить '%s' кг тк максимальная грузоподъемность авто '%s', " +
                    "а на текущий момент авто уже заполнено на '%s' кг", amountOfCargo, LOAD_CAPACITY, workload));
        }

        workload += amountOfCargo;
    }
}