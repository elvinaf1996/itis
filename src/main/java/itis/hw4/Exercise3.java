package itis.hw4;

//3. Есть прямоугольный треугольник, значения катетов которого вводятся с клавиатуры если треугольник с
//        такими параметрами создать невозможно, высвечивается соответствующее сообщение, и программа
//
//        будет просить ввести значения сторон снова, до тех пор, пока не будут получены корректные значения.
//        Достроить этот треугольник до прямоугольника и найти его площадь через диагональ. Значение площади округлить до десятых.

import itis.hw4.exercise1.RightTriangle;

import static itis.utils.PrintUtils.printf;
import static itis.utils.PrintUtils.println;

public class Exercise3 {

    public static void main(String[] args) {
        RightTriangle rightTriangle = new RightTriangle();
        println("****************Запущена программа расчета площади прямоугольного треугольника*****************");
        rightTriangle.enterFirstLegAndHypotenuse();
        printf("**********************Площадь прямоугольника через диагональ равна %s*********************", rightTriangle.getRectangleSquare());
    }
}