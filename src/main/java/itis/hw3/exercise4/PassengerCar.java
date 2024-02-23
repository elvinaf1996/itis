package itis.hw3.exercise4;

import static java.lang.String.format;

//Используя наследованные, реализовать класс «Легковой автомобиль»
//Добавь по одному свойству и одному методу.

public class PassengerCar extends Car {

    private final int MAX_PASSENGERS_COUNT;
    private int passengersCountInCar;

    public PassengerCar(int velocity, Transmission transmission, int maxPassengersCount, int passengersCount) {
        super(velocity, transmission);
        this.MAX_PASSENGERS_COUNT = maxPassengersCount;
        this.passengersCountInCar = passengersCount;
    }

    public PassengerCar(int maxPassengersCount) {
        super(0, Transmission.NEUTRAL);
        this.MAX_PASSENGERS_COUNT = maxPassengersCount;
        this.passengersCountInCar = 0;
    }

    public PassengerCar(int maxPassengersCount, int passengersCount) {
        this.MAX_PASSENGERS_COUNT = maxPassengersCount;
        this.passengersCountInCar = passengersCount;
    }

    public void boardPassenger(int countPassenger) {
        if (countPassenger > MAX_PASSENGERS_COUNT) {
            throw new IllegalArgumentException(format("Количество пассажиров превышает допустимое количество в авто. " +
                    "Максимальная вместимость авто %s пассажиров", MAX_PASSENGERS_COUNT));
        }

        if (countPassenger + passengersCountInCar > MAX_PASSENGERS_COUNT) {
            throw new IllegalArgumentException(format("Количество пассажиров превышает допустимое количество в авто. " +
                    "Максимальная вместимость авто %s пассажиров, в авто уже %s пассажиров", MAX_PASSENGERS_COUNT, passengersCountInCar));
        }

        passengersCountInCar += countPassenger;
    }
}
