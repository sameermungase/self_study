package array;

import java.util.Arrays;

public class SortArrayElements {

    public static void main(String[] args) {
        int array[] = {3,2,5,6,7,1,4};

//        1. Using inbuilt method
        Arrays.sort(array);
        for(int i = 0 ; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }

        System.out.println();
        // 2. Using for loops
        array = new int[]{3, 2, 5, 6, 7, 1, 4};
        for(int i= 0; i <array.length;i++){
            for(int j=i+1; j< array.length;j++){
                if(array[i]> array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i = 0 ; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

    }
}
