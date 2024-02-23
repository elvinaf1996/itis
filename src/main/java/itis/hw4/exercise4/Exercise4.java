package itis.hw4.exercise4;

//С клавиатуры вводится два числа, первое – основание логорифма,
//        второе – аргумент логорифма, нужно вычислить этот логорифм. Также вычислить логорифмы (см картинку)

import java.util.Scanner;

import static itis.utils.PrintUtils.println;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Logarithm consoleLogarithm = new Logarithm();
        consoleLogarithm.setBaseFromConsole(sc)
                .setArgumentFromConsole(sc);
        println(consoleLogarithm);
        println();

        Logarithm aLogarithm = new Logarithm(4, 16);
        println(aLogarithm);
        println();

        Logarithm bLogarithm = new Logarithm(3, 1/3.0);
        println(bLogarithm);
        println();

        Logarithm cLogarithm = new Logarithm(Math.sqrt(5), 1);
        println(cLogarithm);
        println();

        Logarithm dLogarithm = new Logarithm(Math.sqrt(7), 7);
        println(dLogarithm);
        println();

        Logarithm eLogarithm = new Logarithm();
        eLogarithm.setBase(3)
                .setArgument(Math.sqrt(3));
        println(eLogarithm);
        println();
    }
}