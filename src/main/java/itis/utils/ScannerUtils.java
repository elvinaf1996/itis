package itis.utils;

import java.util.Scanner;

public class ScannerUtils {

    public static int getInt(Scanner scanner) {
        try {
            return scanner.nextInt();
        } catch (Exception ex) {
           throw new IllegalArgumentException("Введено не целое число");
        }
    }

    public static double getDouble(Scanner scanner) {
        try {
            return scanner.nextDouble();
        } catch (Exception exception) {
            throw new IllegalArgumentException("Введена строка, ожидалось число");
        }
    }

    public static String[] getStringMassiveFromConsole(Scanner sc, int size) {
        String[] massive = new String[size];

        for (int i = 0; i < size; i++) {
            massive[i] = sc.nextLine();
        }

        return massive;
    }

    public static int[] getIntegerMassiveFromConsole(Scanner sc, int size) {
        int[] massive = new int[size];

        for (int i = 0; i < size; i++) {
            massive[i] = getInt(sc);
        }

        return massive;
    }

    public static double[] getDoubleMassiveFromConsole(Scanner sc, int size) {
        double[] massive = new double[size];

        for (int i = 0; i < size; i++) {
            massive[i] = getDouble(sc);
        }

        return massive;
    }
}
