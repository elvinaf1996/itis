package itis.hw4.exercise7;

//7. Необходимо создать три потока которые изменяют один и тот же объект.
//        Каждый поток должен вывести на экран одну букву 100 раз, и затем увеличить значение символа на 1.
//        a) Создать класс расширяющий Thread.
//        б) Переопределить метод run(), здесь будет находится синхронизированный блок кода.
//        в) Для того чтобы три объекта-потока имели доступ к одному объекту,
//            создаем конструктор принимающий на вход StringBuilder объект.
//        г) Синхронизированный блок кода будет получать монитор на объект StringBuilder из пункта в).
//        д) Внутри синхронизированного блока кода выведите StringBuilder на экран 100 раз,
//            а потом увеличьте значение символа на 1.
//        е) В методе main() создайте один объект класса StringBuilder, используя символ ‘a’.
//            Затем создайте три экземпляра объекта нашего класса и запустите потоки.


public class Exercise7 {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder().append('a');
        Program program1 = new Program(stringBuilder);
        Program program2 = new Program(stringBuilder);
        Program program3 = new Program(stringBuilder);
        program1.start();
        program2.start();
        program3.start();
    }
}