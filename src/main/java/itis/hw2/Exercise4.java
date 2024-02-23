package itis.hw2;

//4. Написать метод, с клавиатуры вводится число, нужно посчитать сумму цифр этого числа и вывести на печать

import itis.utils.ScannerUtils;

import java.util.Scanner;

import static itis.utils.PrintUtils.println;

public class Exercise4 {
    public static void main(String[] args) {

        println("Могу посчитать сумму цифр числа :)");
        println("Введи число, докажу тебе это!");
        Scanner sc = new Scanner(System.in);
        int value = ScannerUtils.getInt(sc);
        println(getNumbersSum(String.valueOf(value)));
    }

    public static int getNumbersSum(String number) {
        int numberSum = 0;
        char[] numbersChar = number.toCharArray();

        for (char num : numbersChar) {
            numberSum += Integer.parseInt(String.valueOf(num));
        }

        return numberSum;
    }
}