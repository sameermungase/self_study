package stringOperations;

public class Palindrome {
    public static void main(String[] args) {

        String str = new String("madam");
        if (str.equals(reverseSTring(str))) {
            System.out.print("Yes . Palindrome.");
        } else {
            System.out.print("No . Palindrome.");
        }
    }

    private static String reverseSTring2(String str) {
        char[] arr = str.toCharArray();
        String newStr = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            newStr = newStr + arr[i];
        }
        return newStr;
    }

    private static String reverseSTring(String str) {
        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newStr = newStr + str.charAt(i);
        }
        return newStr;
    }

}
