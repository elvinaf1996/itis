package itis.hw3.exercise6;

//У элемента есть три атрибута: имя, стоимость, количество. При выводе на консоли должен отображаться
//        список в формате: индекс, имя, стоимость, количество, например: 0 apple 120 5.
//        При удалении элемента удаляется в целом сам элемент вне зависмости от его количества.

import static java.lang.String.format;

public class Product {

    private String name;
    private int cost;
    private int count;

    public Product(String name, int cost, int count) {
        this.name = name;
        this.cost = cost;
        this.count = count;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return format("%s %s %s", name, cost, count);
    }
}
