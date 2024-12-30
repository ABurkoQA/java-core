package javaCoreTwo.javaCorePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaPractice {

    private static final String PREFIX = "de";

    public static List<String> findWordByPrefix(String input) {
        List<String> splitText= Arrays.stream(input.split("[^a-zA-Z]+")).toList();
        List<String> resultList = new ArrayList<>();

        for(String text : splitText) {
            if(text.startsWith(PREFIX))
                resultList.add(text);
        }

        return resultList;
    }
}
