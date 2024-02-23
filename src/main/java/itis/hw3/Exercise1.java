package itis.hw3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static itis.utils.PrintUtils.println;
import static itis.utils.ScannerUtils.getDouble;

//    1). На вход поступает два числа, нижняя граница и верхняя граница. Заполнить массив из 10 чисел этими случайными числами

public class Exercise1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        println("Введите нижнюю границу: ");
        double floor = getDouble(sc);
        println("Введите верхнюю границу: ");
        double ceil = getDouble(sc);

        if (ceil <= floor) {
            println("Верхняя граница должна быть больше нижней");
            return;
        }

        println("Полученный массив " + Arrays.toString(getRandomMassiveFromRange(floor, ceil, 10)));
    }

    public static double[] getRandomMassiveFromRange(double floor, double ceil, int size) {
        Random random = new Random();
        double[] massive = new double[size];

        for (int i = 0; i < size; i++) {
            massive[i] = random.nextDouble(floor, ceil);
        }

        return massive;
    }
}