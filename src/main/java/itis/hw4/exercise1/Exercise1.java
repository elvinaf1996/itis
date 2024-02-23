package itis.hw4.exercise1;

//1. Найти площадь прямоугольного треугольника, если известны его катет и гипотенуза,
//значения этих сторон вводятся с клавиатуры. Если треугольник с такими параметрами создать невозможно,
//высвечивается соответствующее сообщение, и программа будет просить ввести значения сторон снова,
//до тех пор, пока не будут получены корректные значения. Значение площади округлить до ДЕСЯТЫХ.

import static itis.utils.PrintUtils.printf;
import static itis.utils.PrintUtils.println;

public class Exercise1 {

    public static void main(String[] args) {
        RightTriangle rightTriangle = new RightTriangle();
        println("****************Запущена программа расчета площади прямоугольного треугольника*****************");
        rightTriangle.enterFirstLegAndHypotenuse();
        printf("**********************Площадь прямоугольного треугольника равна %s*********************", rightTriangle.getSquare());
    }
}