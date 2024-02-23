package itis.utils;

public class PrintUtils {
    
    public static void println(Object object) {
        System.out.println(object);
    }
    
    public static void printf(String format, Object ... args) {
        System.out.printf(format, args);
    }

    public static void println() {
        System.out.println();
    }
}