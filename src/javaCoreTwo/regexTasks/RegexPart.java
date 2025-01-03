package javaCoreTwo.regexTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPart {

    private final static String PATTERN = "orderUUID";
    private final static String EMAIL_PATTERN = "[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";
    private final static String ORDERS_PATTERN = "\\[(\\d+)\\]";

    // Part 1

    public static boolean checkForPattern(String input) {
        return input.contains(PATTERN);
    }

    // Part 2

    public static String findPattern(String input) {
        String result = "";

        int index = input.indexOf(PATTERN);

        if(index != -1)
            result = input.substring(index, index + PATTERN.length());

        return result;
    }

    // Part 3

    public static String findEmail(String input) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(input);

        if(matcher.find()) {
            return matcher.group();
        }

        return "";
    }

    // Part 4

    public static int findOrders(String input) {
        Pattern patt = Pattern.compile(ORDERS_PATTERN);
        Matcher matcher = patt.matcher(input);

        if(matcher.find())
            return Integer.parseInt(matcher.group(1));

        return -1;
    }
}
