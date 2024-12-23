package firstTask;

import java.util.Arrays;

public class SortedArray {

    // O(n)

    public static boolean checkSortedArray(int size, String input) {
        String[] arraySplit = input.split(" ");

        int[] convertArray = new int[size];

        for (int i = 0; i < arraySplit.length; i++) {
            convertArray[i] = Integer.parseInt(arraySplit[i]);
        }

        int[] sortedArray = convertArray.clone();

        Arrays.sort(sortedArray);

        return Arrays.equals(sortedArray, convertArray);
    }
}
