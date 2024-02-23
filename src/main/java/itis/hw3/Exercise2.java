package itis.hw3;

import java.util.Scanner;

import static itis.utils.PrintUtils.println;
import static itis.utils.ScannerUtils.getDouble;

//   2). На вход поступают числа, стоимость товара, и скидка на товар в процентах. Рассчитать стоимость с учетом скидки

public class Exercise2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        println("Введите стоимость товара: ");
        double price = getDouble(sc);
        println("Введите скидку на товар: ");
        double discount = getDouble(sc);

        if (discount > 100) {
            println("Скидка не может быть больше 100%");
            return;
        }

        println("Стоимость товара с учетом скидки " + getPriceWithDiscount(price, discount));
    }

    public static String getPriceWithDiscount(double price, double discountPercent) {
        double pricePartAfterDiscount = (100 - discountPercent) / 100;
        double priceAfterDiscount = price * pricePartAfterDiscount;

        return String.format("%.2f", priceAfterDiscount);
    }
}