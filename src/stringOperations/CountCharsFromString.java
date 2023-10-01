package stringOperations;

public class CountCharsFromString {
    public static void main(String[] args) {
        String text = "Rambo";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            count++;
        }

        System.out.println(count);
        System.out.println(countLength(text));
    }

    private static int countLength(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            count++;
        }
        return count;
    }

    private static int countLength2(String text) {
        return text.toCharArray().length;
    }


}
