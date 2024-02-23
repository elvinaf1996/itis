package itis.hw2;

//6. На вход поступает число из 6 цифр, нужно проверить счастливый ли это номерю. Номер счастливый,
//если сумма его первых трех цифр равна сумме трех последних цифр
//Если номер счастливый,  то выводится строка Билет счастливый, инчае Билет не счастливый

import itis.utils.ScannerUtils;

import java.util.Scanner;

import static itis.utils.PrintUtils.println;

public class Exercise6 {
    public static void main(String[] args) {
        println("Введите число из 6 цифр");
        Scanner sc = new Scanner(System.in);
        int num = ScannerUtils.getInt(sc);
        if (String.valueOf(num).length() != 6) {
            println("Число не 6-ти значное");
            return;
        }

        if (isNumberHappy(num)) {
            println("Билет счастливый");
        } else {
            println("Билет не счастливый");
        }
    }

    public static boolean isNumberHappy(int num) {
        int firstPart = 0;
        int secondPart = 0;
        char[] nums = String.valueOf(num).toCharArray();
        int halfIndex = nums.length / 2;

        for (int i = 0; i < nums.length; i++) {
            int value = Integer.parseInt(String.valueOf(nums[i]));
            if (i < halfIndex) {
                firstPart += value;
            } else {
                secondPart += value;
            }
        }

        return firstPart == secondPart;
    }
}