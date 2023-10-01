package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementsFromArray {
    // Find duplicate elements from single array

    int arrayOfNumbers[];
    String[] strArray = {"ajit", "ashwini", new String("ajit")};

    public static void main(String[] args) {
        Set duplicates = new HashSet();
        DuplicateElementsFromArray d = new DuplicateElementsFromArray();
        d.arrayOfNumbers = new int[]{1, 4, 2, 4, 6, 5, 4, 2};
        for (int i = 0; i < d.arrayOfNumbers.length; i++) {
            for (int j = i + 1; j < d.arrayOfNumbers.length; j++) {
                if (d.arrayOfNumbers[i] == d.arrayOfNumbers[j]) {
                    duplicates.add(d.arrayOfNumbers[i]);
                }
            }
        }
        for (int i = 0; i < d.strArray.length; i++) {
            for (int j = i + 1; j < d.strArray.length; j++) {
                if (d.strArray[i].equals(d.strArray[j])) {
                    duplicates.add(d.strArray[i]);
                }
            }
        }


        System.out.println(duplicates);
    }

}