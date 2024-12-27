package javaCoreTwo.collectionsAndArrays;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class FourthPart {
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

    static Path path = Paths.get(System.getProperty("user.home"),"Desktop", "beatles.txt");

    public static void saveStringToFile() {
        try {
            if(!Files.exists(path)) {
                Files.createFile(path);
            }

            Files.writeString(path, beatlesSubmarine, StandardCharsets.UTF_8);
        } catch (IOException ex) {
            System.out.println("File doesn't exist");
        }
    }

    public static String readFromFile() {
        String result = "";

        try {
            result = Files.readString(path);
        } catch (IOException ex) {
            System.out.println("Error reading file!");
        }

        return result;
    }

    // In description it doesn't say that search is case sensitive

    public static boolean findLine(String input) {
        String song = beatlesSubmarine.toLowerCase();

        try {
            if (song.contains(input.toLowerCase()))
                return true;

            throw new BeatlesException("Something wrong");
        } catch (BeatlesException e){
            System.out.println(e.getMessage());
        }

        return false;
    }
}

class BeatlesException extends Exception {

    public BeatlesException(String errorMessage){
        super("Beatles - " + errorMessage);
    }
}
