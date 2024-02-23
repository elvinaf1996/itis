package itis.hw4.exercise4;

import java.util.Scanner;

import static itis.utils.PrintUtils.println;
import static itis.utils.ScannerUtils.getDouble;

public class Logarithm {

    private double base;
    private double argument;

    public Logarithm() {
    }

    public Logarithm(double base, double argument) {
        this.base = base;
        this.argument = argument;
    }

    public Logarithm setBaseFromConsole(Scanner sc) {
        println("Введите основание логарифма");
        base = getDouble(sc);

        return this;
    }

    public Logarithm setBase(double base) {
        this.base = base;

        return this;
    }

    public Logarithm setArgument(double argument) {
        this.argument = argument;

        return this;
    }

    public Logarithm setArgumentFromConsole(Scanner sc) {
        println("Введите аргумент логарифма");
        argument = getDouble(sc);

        return this;
    }

    @Override
    public String toString() {
        double value = Math.log(argument) / Math.log(base);
        return String.valueOf(value);
    }
}
