package itis.hw4.exercise6;

//6. Создать класс, реализующий интерфейс Runnable. Переопределить run() метод. Создать цикл for.
//        В цикле распечатываем значения от 0 до 100 делящиеся на 10 без остатка.
//        Используем статический метод Thread.sleep() чтобы сделать паузу.
//        Создать три потока, выполняющих задачу распечатки значений.

public class Exercise6 {

    public static void main(String[] args) {
        PrintRoundNumb printRoundNumb = new PrintRoundNumb();

        new Thread(printRoundNumb).start();
        new Thread(printRoundNumb).start();
        new Thread(printRoundNumb).start();
    }
}