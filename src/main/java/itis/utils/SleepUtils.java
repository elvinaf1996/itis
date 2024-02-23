package itis.utils;

public class SleepUtils {

    public static void sleep(long millis) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
