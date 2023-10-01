package stringOperations;

import java.util.*;

public class FrequencyOfChars {
    public static void main(String[] args) {
        String str = "Ashwini Aaditya Ajit";
        Map<Character, Integer> map = new LinkedHashMap<>();
          str= str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')) {
                if (map.containsKey(str.charAt(i))) {
                    int count = map.get(str.charAt(i));
                    map.put(str.charAt(i), count + 1);
                } else {
                    map.put(str.charAt(i), 1);
                }
            }
        }

        System.out.println(map);

        List<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            if (!list.contains(str.charAt(i))) {
                list.add(str.charAt(i));
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }
                System.out.println("Char: " + str.charAt(i) + " count:" + count);
            }
        }
    }
}
