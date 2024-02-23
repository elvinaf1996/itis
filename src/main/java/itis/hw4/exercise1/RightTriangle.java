package itis.hw4.exercise1;

import java.util.Scanner;

import static itis.utils.PrintUtils.println;
import static itis.utils.ScannerUtils.getDouble;
import static java.lang.Math.sqrt;
import static java.lang.String.format;

public class RightTriangle {

    private double firstLeg;
    private double secondLeg;
    private double hypotenuse;

    public String getSquare() {
        return format("%.1f", firstLeg * secondLeg / 2);
    }

    public String getRectangleSquare() {
        if (firstLeg != 0 && hypotenuse != 0) {
            double square = firstLeg * sqrt(Math.pow(hypotenuse, 2) - Math.pow(firstLeg, 2));
            return format("%.1f", square);
        } else if (secondLeg != 0 && hypotenuse != 0) {
            double square = secondLeg * sqrt(Math.pow(hypotenuse, 2) - Math.pow(secondLeg, 2));
            return format("%.1f", square);
        }

        throw new RuntimeException("Недостаточно данных для вычисления площади");
    }

    public void enterFirstLegAndHypotenuse() {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);

        while (flag) {
            println("Введите значение катета: ");
            double firstLag = getDouble(sc);
            println("Введите значение гипотенузы: ");
            double hypotenuse = getDouble(sc);
            double secondLagSquare = Math.pow(hypotenuse, 2) - Math.pow(firstLag, 2);
            double secondLag;

            if (secondLagSquare < 0) {
                println("Из данных значений невозможно построить прямоугольный треугольник, попробуйте еще раз");
                continue;
            } else {
                secondLag = sqrt(secondLagSquare);
                if (firstLag + secondLag <= hypotenuse || firstLag + hypotenuse <= secondLag || secondLag + hypotenuse <= firstLag) {
                    println("Из данных значений невозможно построить прямоугольный треугольник, попробуйте еще раз");
                    continue;
                }
            }

            this.firstLeg = firstLag;
            this.secondLeg = secondLag;
            this.hypotenuse = hypotenuse;
            flag = false;
        }
    }
}
