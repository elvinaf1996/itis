package itis.hw1;

import itis.utils.ScannerUtils;

import java.util.Scanner;

import static itis.utils.PrintUtils.println;
import static java.lang.String.format;

public class Calc {

//    Задача, класс calc переписать/дописать таким образом, чтобы при ответе на вопрос "Начать работать?" текстом "ESC"
//    программа заканчивала свою работу(Подсказка, посмотреть как сравнивать строки).
//    Изменить конструкцию sout(где идет ввод операции чисел помимо 1,2,3,4) на создание своей собственной ошибки,
//    с помощью конструкции throw new Exception. Задание до следующего понедельника, работающий класс присылать мне в личные сообщения.

    public static void main(String[] args) {
        String escape = "ESC";
        boolean isEnd;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            println("Хотите начать работать? ");
            String stroka = scanner.nextLine();
            isEnd = stroka.equalsIgnoreCase(escape);

            if (isEnd) {
                println("Спасибо за использование");
                return;
            }

            println("Введите первое число: ");
            double num1 = ScannerUtils.getDouble(scanner);
            println("Введите второе число: ");
            double num2 = ScannerUtils.getDouble(scanner);
            println("Введите операцию: ");
            println("1. Сложение");
            println("2. Вычетание");
            println("3. Умножение");
            println("4. Деление");
            int num3 = ScannerUtils.getInt(scanner);

            if (num3 > 4 || num3 < 1) {
                throw new IllegalArgumentException(format("Ожидал число от 1 до 4, по факту получил: %s", num3));
            }

            switch (num3) {
                case 1 -> println(sum(num1, num2));
                case 2 -> println(minus(num1, num2));
                case 3 -> println(mult(num1, num2));
                case 4 -> println(devid(num1, num2));
            }
        }
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static double minus(double num1, double num2) {
        return num1 - num2;
    }

    public static double mult(double num1, double num2) {
        return num1 * num2;
    }

    public static double devid(double num1, double num2) {
        return num1 / num2;
    }
}