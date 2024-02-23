package itis.hw3.exercise6;

//6) Создать программу по учету товара. При запуске программы будет выводиться сообщение,
//        что вы хотите сделать: добавить элемент, удалить элемент, вывести все элементы на складе.
//        У элемента есть три атрибута: имя, стоимость, количество. При выводе на консоли должен отображаться
//        список в формате: индекс, имя, стоимость, количество, например: 0 apple 120 5.
//        При удалении элемента удаляется в целом сам элемент вне зависмости от его количества.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static itis.utils.PrintUtils.printf;
import static itis.utils.PrintUtils.println;
import static itis.utils.ScannerUtils.getInt;

public class Exercise6 {

    public static void main(String[] args) {
        List<Product> allProducts = new ArrayList<>();
        println("*****************Учет товаров******************");
        Scanner sc = new Scanner(System.in);
        String exitMessage = "ESC";

        while (true) {
            printf("Для завершения программы нажмите '%s', для продолжения любую строку \n", exitMessage);
            String line = sc.nextLine();

            if (line.equalsIgnoreCase(exitMessage)) {
                println("**************Программа завершена**************");
                return;
            }

            println("Выберите, что вы хотите сделать");
            println("1 - добавить элемент");
            println("2 - удалить элемент");
            println("3 - вывести все элементы на складе");

            int choice = getInt(sc);
            sc.nextLine();
            while (choice < 1 || choice > 3) {
                println("Введите число от 1 до 3");
                choice = getInt(sc);
                sc.nextLine();
            }

            switch (choice) {
                case 1 -> {
                    allProducts.add(getElementFromConsole(sc));
                    println("Продукт добавлен!");
                }
                case 2 -> deleteElementFromConsole(sc, allProducts);
                case 3 -> printAllProducts(allProducts);
            }
        }
    }

    public static Product getElementFromConsole(Scanner sc) {
        println("Введите имя, стоимость и количество продуктов");
        String name = sc.nextLine();
        int cost = sc.nextInt();
        int count = sc.nextInt();
        sc.nextLine();

        return new Product(name, cost, count);
    }

    public static void deleteElementFromConsole(Scanner sc, List<Product> products) {
        println("Введите имя продукта, который хотите удалить");
        String productName = sc.nextLine();
        products.remove(getProductByName(products, productName));
    }

    public static Product getProductByName(List<Product> products, String productName) {
        return products.stream()
                .filter(p -> p.getName().equalsIgnoreCase(productName))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Не надйен продукт с названием товара ".concat(productName)));

    }

    public static void printAllProducts(List<Product> products) {
        for (int i = 0; i < products.size(); i++) {
            println(i + " " + products.get(i));
        }
    }
}