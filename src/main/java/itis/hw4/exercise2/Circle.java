package itis.hw4.exercise2;

//Длина окружности равна 47.1, требуется найти радиус круга и площадь круга, значение площади округлить до ЦЕЛЫХ.
public class Circle {

    private final double PI = Math.PI;
    private double circumference;
    private double radius;

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public double getRadius() {
        if (radius == 0 && circumference == 0) {
            throw new RuntimeException("Недостаточно данных для вычисления радиуса");
        } else if (radius != 0) {
            return radius;
        } else {
            return circumference / 2 / PI;
        }
    }

    public double getSquare() {
        if (radius == 0 && circumference == 0) {
            throw new RuntimeException("Недостаточно данных для вычисления площади");
        } else if (radius != 0) {
            return PI * Math.pow(radius, 2);
        } else {
            return PI * Math.pow(getRadius(), 2);
        }
    }
}
