package itis.hw2;

//7. Заполнить массив числами с клавиатуры, вывести на печать этот массив,
//найти минимальное и максимальное значения из этого массива

import itis.utils.PrintUtils;
import itis.utils.ScannerUtils;

import java.util.Arrays;
import java.util.Scanner;

import static itis.utils.PrintUtils.printf;
import static itis.utils.PrintUtils.println;
import static itis.utils.ScannerUtils.getInt;

public class Exercise7 {
    public static void main(String[] args) {

        println("Введите размер массива: ");
        Scanner sc = new Scanner(System.in);
        int size = getInt(sc);
        println("Введите значения массива: ");
        double[] massive = ScannerUtils.getDoubleMassiveFromConsole(sc, size);
        printf("Массив: %s \n", Arrays.toString(massive));
        printf("Максимально значение массива: %s \n", getMaxValueFromMassive(massive));
        printf("Минимальное значение массива: %s \n", getMinValueFromMassive(massive));
    }

    public static double getMaxValueFromMassive(double[] massive) {
        double maxValue = massive[0];

        for (double value : massive) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        return maxValue;
    }

    public static double getMinValueFromMassive(double[] massive) {
        double minValue = massive[0];

        for (double value : massive) {
            if (value < minValue) {
                minValue = value;
            }
        }

        return minValue;
    }
}