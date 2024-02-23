package itis.hw2;

//    5. На вход поступает число - количество чисел в массиве. Происходит заполнение этого массива числами с клавиатуры.
//       Задача - вывести сумму чисел, всех нечетных индексов в массиве

import java.util.Arrays;
import java.util.Scanner;

import static itis.utils.PrintUtils.printf;
import static itis.utils.PrintUtils.println;
import static itis.utils.ScannerUtils.getInt;
import static itis.utils.ScannerUtils.getIntegerMassiveFromConsole;

public class Exercise5 {
    public static void main(String[] args) {
        println("Введите количество чисел в массиве: ");
        Scanner sc = new Scanner(System.in);
        int size = getInt(sc);
        int[] mass = getIntegerMassiveFromConsole(sc, size);
        int sum = 0;

        for (int i = 1; i < size; i += 2) {
            sum += mass[i];
        }

        printf("Сумма чисел на нечетных индексах массива '%s' равна '%s'", Arrays.toString(mass), sum);
    }
}