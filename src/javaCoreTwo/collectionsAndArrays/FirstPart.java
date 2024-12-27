package javaCoreTwo.collectionsAndArrays;
import java.util.*;

public class FirstPart {
     static String beatlesSubmarine = "In the town where I was born\n" +
            "Lived a man who sailed to sea\n" +
            "And he told us of his life\n" +
            "In the land of submarines\n" +
            "So we sailed on to the sun\n" +
            "'Til we found a sea of green\n" +
            "And we lived beneath the waves\n" +
            "In our yellow submarine\n" +
            "We all live in a yellow submarine\n" +
            "Yellow submarine, yellow submarine\n" +
            "We all live in a yellow submarine\n" +
            "Yellow submarine, yellow submarine\n" +
            "And our friends are all aboard\n" +
            "Many more of them live next door\n" +
            "And the band begins to play\n" +
            "We all live in a yellow submarine\n" +
            "Yellow submarine, yellow submarine\n" +
            "We all live in a yellow submarine\n" +
            "Yellow submarine, yellow submarine\n" +
            "Full steam ahead, Mister Boatswain, full steam ahead\n" +
            "Full steam ahead it is, Sergeant\n" +
            "(Cut the cable, drop the cable)\n" +
            "Aye-aye, sir, aye-aye\n" +
            "Captain, captain\n" +
            "As we live a life of ease (a life of ease)\n" +
            "Every one of us (every one of us)\n" +
            "Has all we need (has all we need)\n" +
            "Sky of blue (sky of blue)\n" +
            "And sea of green (sea of green)\n" +
            "In our yellow (in our yellow)\n" +
            "Submarine (submarine, aha)\n" +
            "We all live in a yellow submarine\n" +
            "A yellow submarine, yellow submarine\n" +
            "We all live in a yellow submarine\n" +
            "A yellow submarine, yellow submarine\n" +
            "We all live in a yellow submarine\n" +
            "Yellow submarine, yellow submarine\n" +
            "We all live in a yellow submarine\n" +
            "Yellow submarine, yellow submarine";

     static String[] allWords = makingArrayOfWords();

    public static String removeSymbolToLower() {
        return beatlesSubmarine.toLowerCase()
                .replace("\n"," ").replace(",","");
    }

    public static String[] makingArrayOfWords() {
        String lowerCaseSong = removeSymbolToLower();

        return lowerCaseSong.split("[^a-z]+");
    }

    public static String[] uniqueMaker() {
        String[] uniqueWords = new String[allWords.length];

        int uniqueCount = 0;

        for(String text : allWords){
            boolean isUnique = true;

            for(int i = 0; i < uniqueCount; i++){
                if(uniqueWords[i].equals(text)){
                    isUnique = false;
                    break;
                }
            }

            if(isUnique){
                uniqueWords[uniqueCount++] = text;
            }
        }

        String[] uniqueTotal = Arrays.copyOfRange(uniqueWords,0, uniqueCount);

        return uniqueTotal;
    }

    public static void wordCounter() {
        String[] unqieWords = uniqueMaker();

        for(String word : unqieWords) {
            int count = 0;

            for(int i = 0; i < allWords.length; i++) {
                if(allWords[i].equals(word))
                    count++;
            }

            System.out.println("Word - \"" + word + "\" times repeat - " + count);
        }
    }
}