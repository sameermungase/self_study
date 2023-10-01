package array;

import java.util.Arrays;

public class LongestStringInArray {
    public static void main(String[] args) {
        String[] arr = new String[4];
        arr[0] = "ajit";
        arr[1] = "ajitKumar";
        arr[2] = "ajitShwini";
        arr[3] = "ajitThakare";

        String longestString = getLongestString(arr);
        System.out.println(longestString);

    }

    private static String getLongestString(String[] arr) {

        int higherLength = 0;
        String currentLongWord = null;
        for (String str : arr) {
            if (str.length() > higherLength) {
                higherLength = str.length();
                currentLongWord = str;
            }
        }
        return currentLongWord;
    }
}
