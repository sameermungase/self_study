package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class compareArrays {
    public static void main(String[] args) {
        int[] array1 = {3, 4, 7, 2, 1}, array2 = {1, 6, 9, 7, 3, 5, 0, 1, 3, 3, 3};
        List list = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) list.add(array2[j]);
            }
        }
        
//        System.out.println(list);
//        for (Object num: new HashSet<>(list) ) {
//            System.out.println(num +" "+ Collections.frequency(list,num));
//        }

    }
}
