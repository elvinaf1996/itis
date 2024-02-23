package itis.hw3;

import java.util.Random;
import java.util.Scanner;

import static itis.utils.PrintUtils.printf;
import static itis.utils.PrintUtils.println;
import static itis.utils.ScannerUtils.getInt;

//   3). Написать программу, в который вы будете угадывать число. На вход приходит диапазон из чисел и количество жизней.
//   Вам нужно угадать, какое число было загадано(оно у вас генерируется внутри программы случайным образом).
//   Если ваше число находится рядом от загаданного (+-2) то выведет соответствующее сообщение,
//   в противном случае выводит иное сообщение. Например загаданное число 12, вы ввели число 10 или 14,
//   вам выведется сообщение, что вы находитесь рядом. Если вы введете 7, выведет сообщение что вы не рядом.
//   Игра закончится, когда количество жизней будет = 0. Вы будете играть, пока не напечатаете в консоли
//   esc(неважно каким регистром, он должен воспринять как ESC, Esc, esC ...)

//считаю, что речь идет о натуральных числах

public class Exercise3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String endPhrase = "ESC";

        while (true) {
            println("*****************START GAME*********************");
            println("Начинаем игру!");
            printf("Если не хотите играть, введите '%s', для продолжения наберите любую фразу ", endPhrase);
            String line = sc.nextLine();

            if (line.equalsIgnoreCase(endPhrase)) {
                println("Игра окончена, спасибо, что вы с нами!");
                return;
            }

            println("Замечательно! Продолжаем игру!");
            println("Введите нижний диапазон: ");
            int floor = getInt(sc);
            println("Введите верхний диапазон: ");
            int ceil = getInt(sc);

            if (ceil <= floor) {
                println("Верхний диапазон должен быть выше");
                return;
            }

            println("Сколько дадим тебе попыток на отгадывание?");
            int countLife = getInt(sc);

            println("Загадываю число из диапазона...");
            println("ииии....");
            int numberFromRange = new Random().nextInt(floor, ceil);
            println("Загадал число!");

            if (!isYouGuessedTheNumber(countLife, numberFromRange, sc)) {
                println("Вы проиграли, можете попробовать еще раз");
                println("*******************YOU LOST*********************");
            }

            sc.nextLine();
            println("******************GAME OVER*********************");
            println();
        }
    }

    public static boolean isYouGuessedTheNumber(int countLife, int numberFromRange, Scanner sc) {
        final int GENERAL_COUNT_LIFE = countLife;

        while (countLife > 0) {
            printf("Количество попыток '%s', введите ваше число: ", countLife);
            int variable = getInt(sc);

            if (variable == numberFromRange) {
                printf("Ура, вы угадали с '%s' попытки \n", GENERAL_COUNT_LIFE - countLife + 1);
                println("*******************YOU WIN**********************");
                return true;
            }

            countLife--;
        }

        return false;
    }
}