package itis.hw4;

//5. Используя пакет LocalDate узнать сколько лет, месяцев, дней назад родился человек.
//        Подсказка:
//        Сначала получить текущую дату, затем сгенирировать случайные даты: года с 1950 до 2010, месяца 1-12, дня 1-25.
//        Вычислить разницу с нанешним временем и вывести на пеачать в формате “Человек родился 12 лет 2 месяце 16 дней назад”.


import java.time.LocalDate;
import java.time.Period;
import java.util.Random;

import static itis.utils.PrintUtils.printf;
import static itis.utils.PrintUtils.println;

public class Exercise5 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        Random random = new Random();

        int birthdayYear = random.nextInt(1950, 2011);
        int birthdayMonth = random.nextInt(1, 13);
        int birthdayDay = random.nextInt(1, 26);
        LocalDate birthday = LocalDate.of(birthdayYear, birthdayMonth, birthdayDay);

        println("Сгенерировал дату рождения человека: " + birthday);

        Period dateDelta = Period.between(birthday, now);

        printf("Человек родился '%s' лет '%s' месяцев '%s' дней назад", dateDelta.getYears(), dateDelta.getMonths(), dateDelta.getDays());
    }
}