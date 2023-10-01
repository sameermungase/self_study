package stringOperations;

public class ReverseString {
    public static void main(String[] args) {

        String str = new String("Raman");
        String str2 = "Ajit";

        System.out.println(reverseSTring1(str));
        System.out.println(reverseSTring2(str2));
        System.out.println(reverseSTring3(str));
    }

    private static StringBuilder reverseSTring1(String str) {
        return new StringBuilder(str).reverse();
    }

    private static String reverseSTring2(String str) {
        char[] arr = str.toCharArray();
        String newStr = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            newStr = newStr + arr[i];
        }
        return newStr;
    }

    private static String reverseSTring3(String str) {
        char[] arr = str.toCharArray();
        StringBuilder newStr = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            newStr.append( arr[i]);
        }
        return newStr.toString();
    }


}
