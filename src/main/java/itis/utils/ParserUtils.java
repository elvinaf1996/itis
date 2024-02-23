package itis.utils;

public class ParserUtils {

    public static boolean isStringDouble(String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    public static boolean isStringInteger(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }
}