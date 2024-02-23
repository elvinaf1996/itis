package itis.hw4.exercise2;

//Длина окружности равна 47.1, требуется найти радиус круга и площадь круга, значение площади округлить до ЦЕЛЫХ.

import static itis.utils.PrintUtils.println;

public class Exercise2 {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setCircumference(47.1);
        println("Радиус круга " + Math.round(circle.getRadius()));
        println("Площадь круга " + Math.round(circle.getSquare()));
    }
}