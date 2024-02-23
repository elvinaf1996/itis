package itis.hw4.exercise6;

import itis.utils.SleepUtils;
import lombok.SneakyThrows;

import static itis.utils.PrintUtils.println;

//Создать цикл for.
//        В цикле распечатываем значения от 0 до 100 делящиеся на 10 без остатка.
//        Используем статический метод Thread.sleep() чтобы сделать паузу.
public class PrintRoundNumb implements Runnable {

    @Override
    @SneakyThrows
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 0) {
                println(i);
                SleepUtils.sleep(500);
            }
        }
    }
}