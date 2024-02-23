package itis.hw3.exercise5;

//5) Создать интерфейс light с методом гореть. Реализовать использование этого интерфейса в двух классах костер и лампочка.
//При обращении к определенному объекту должно быть выведено сообщение горит этот объект или нет,
//        если да, его можно потушить, если нет, его можно зажечь. Реализовать класс лампа,
//который будет иметь возможность включаться и выключаться, но если он включен, то должно выводиться сообщение
//каким цветом горит эта лампа. Цвет поступает из консоли(сами вводим).

import static itis.utils.PrintUtils.println;

public class Exercise5 {

    public static void main(String[] args) {
        Light bonfire = new Bonfire("red");
        Light bulb = new LightBulb("yellow");

        println(bonfire);
        println(bulb);
        println();

        bonfire.burn();
        println(bonfire);
        bonfire.putOut();
        println(bonfire);
        println();

        bulb.burn();
        println(bulb);
        bulb.putOut();
        println(bulb);
    }
}