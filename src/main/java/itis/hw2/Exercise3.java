package itis.hw2;

//3. Напишите программу, которая инвертирует массив (меняет порядок элементов на противоположный).

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static itis.utils.PrintUtils.println;

public class Exercise3 {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        String exitValue = "ESC";
        println("Введите элементы массива");
        println("Для окончания ввода введите " + exitValue);
        Scanner sc = new Scanner(System.in);

        while (true) {
            String value = sc.nextLine();

            if (value.equalsIgnoreCase(exitValue)) {
                println(arrayList.reversed());
                return;
            }

            arrayList.add(value);
        }
    }
}