package itis.hw2;

//2. Напишите проверку, является ли заданное число простым.

import java.util.Scanner;

import static itis.utils.ParserUtils.isStringDouble;
import static itis.utils.ParserUtils.isStringInteger;
import static itis.utils.PrintUtils.println;

public class Exercise2 {
    public static void main(String[] args) {

        println("Я проверяю является ли ваше число простым");
        println("Введите число");
        Scanner scanner = new Scanner(System.in);
        String numberLine = scanner.nextLine();
        println("Вычисляю");
        println("ИИИИИИИ");

        if (!isStringDouble(numberLine)) {
            println("Увы, строка не может быть простым числом... ");
            return;
        }

        if (!isStringInteger(numberLine)) {
            println("Сожалею, но дробное число не может быть простым");
            return;
        }

        if (isPrimeNumber(Integer.parseInt(numberLine))) {
            println("Да! Ваше число простое!");
        } else {
            println("Увы... Число не является простым :(");
        }
    }

    public static boolean isPrimeNumber(int number) {
        int halfNumber = number / 2;

        for (int i = 2; i < halfNumber; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}