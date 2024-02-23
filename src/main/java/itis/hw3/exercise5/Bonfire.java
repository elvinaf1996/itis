package itis.hw3.exercise5;

public class Bonfire implements Light {

    private String color;
    private boolean isBurn;

    public Bonfire(String color) {
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
            return "Костер горит, цвет " + color;
        }

        return "Костер не горит";
    }
}
