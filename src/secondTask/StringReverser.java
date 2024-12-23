package secondTask;

public class StringReverser {

    // All O(n)

    public static String firstStringReverser(String input){
        if(input.isBlank())
            return input;

        return new StringBuilder(input).reverse().toString();
    }

    public static String secondStringReverser(String input){
        if(input.isBlank())
            return input;

        String result = "";

        for(int i = 0; i < input.length(); i++) {
            result = input.charAt(i) + result;
        }

        return result;
    }

    public static String thirdStringReverses(String input) {
        if(input.isBlank())
            return input;

        return new StringBuffer(input).reverse().toString();
    }
}
