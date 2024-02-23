package itis.hw4.exercise7;

import static itis.utils.PrintUtils.println;

public class Program extends Thread {

    private final StringBuilder stringBuilder;

    public Program(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public void run() {

        synchronized (stringBuilder) {
            for (int i = 0; i < 100; i++) {
                println(stringBuilder);
            }
            char character = stringBuilder.charAt(0);
            stringBuilder.setCharAt(0, ++character);
        }
    }
}
