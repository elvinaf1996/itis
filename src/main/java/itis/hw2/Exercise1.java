package itis.hw2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static itis.utils.ParserUtils.isStringDouble;
import static itis.utils.PrintUtils.printf;
import static itis.utils.PrintUtils.println;

//    1. Напишите программу, которая находит сумму всех чисел от 1 до введенного с консоли.

public class Exercise1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String exitMessage = "ESC";
        println("Введите числа, сумму которых нужно посчитать: ");
        println("P.S. В конце введите " + exitMessage);
        double sum = 0;
        List<Double> numbers = new ArrayList<>();

        while (true) {
            String numberString = sc.nextLine();

            if (numberString.equalsIgnoreCase(exitMessage)) {
                printf("Сумма введенных чисел '%s' равна '%s'", numbers, sum);
                return;
            }

            if (!isStringDouble(numberString)) {
                throw new IllegalArgumentException("Не смогу посчитать сумму, тк было введено не число: " + numberString);
            }

            double number = Double.parseDouble(numberString);
            sum += number;
            numbers.add(number);
        }
    }
}