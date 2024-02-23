package itis.hw3.exercise5;

public class LightBulb implements Light {

    private String color;
    private boolean isBurn;

    public LightBulb(String color) {
        this.color = color;
        isBurn = false;
    }

    @Override
    public void burn() {
        isBurn = true;
    }

    @Override
    public void putOut() {
        isBurn = false;
    }

    @Override
    public String toString() {
        if (isBurn) {
            return "Лампочка зажглась, цвет " + color;
        }

        return "Лампочка выключена";
    }
}
