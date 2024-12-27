package javaCoreTwo.javaCorePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaPractice {

    static final String prefix = "de";

    // If search need to be case sensitive, just need to convert all text to lower case

    public static List<String> findWordByPrefix(String input) {
        List<String> splitText= Arrays.stream(input.split("[^a-zA-Z]+")).toList();
        List<String> resultList = new ArrayList<>();

        for(String text : splitText) {
            if(text.startsWith(prefix))
                resultList.add(text);
        }

        return resultList;
    }
}
