package javaCoreTwo.regexTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPart {

    final static String pattern = "orderUUID";
    final static String emailPattern = "[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";
    final static String ordersPattern = "\\[(\\d+)\\]";

    // Part 1

    public static boolean checkForPattern(String input) {
        return input.contains(pattern);
    }

    // Part 2

    public static String findPattern(String input) {
        String result = "";

        int index = input.indexOf(pattern);

        if(index != -1)
            result = input.substring(index, index + pattern.length());

        return result;
    }

    // Part 3

    public static String findEmail(String input) {
        Pattern patt = Pattern.compile(emailPattern);
        Matcher matcher = patt.matcher(input);

        if(matcher.find()) {
            return matcher.group();
        }

        return "";
    }

    // Part 4

    public static int findOrders(String input) {
        Pattern patt = Pattern.compile(ordersPattern);
        Matcher matcher = patt.matcher(input);

        if(matcher.find())
            return Integer.parseInt(matcher.group(1));

        return -1;
    }
}
