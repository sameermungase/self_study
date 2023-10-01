import java.nio.charset.StandardCharsets;

public class StringManipulation {


    public static void main(String args[]) {

        String str = new String("ABCDEF");

        System.out.println(str);
        System.out.println(str.replace("AB", "12"));
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        boolean isPalindrome = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {

            } else {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("is palindrome :" + isPalindrome);

        System.out.println("Sub string :" + str.substring(2));
//        str = str.substring(2);
        System.out.println("Sub string :" + str.substring(1,3));

    }
}
