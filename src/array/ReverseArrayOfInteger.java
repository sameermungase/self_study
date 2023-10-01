package array;

public class ReverseArrayOfInteger {
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 1, 9,6};

        int[] reversedArray = reverse2(arr);
        for (int i : reversedArray) {
            System.out.print(i + " ");
        }
    }

    private static int[] reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - (1 + i)];
            arr[arr.length - (1 + i)] = temp;
        }
        return arr;
    }

    private static int[] reverse2(int[] arr) {
        int []reversedArray = new int[arr.length];
        int index = 0;
        for (int i = arr.length-1; i>=0; i--) {
            reversedArray[index] = arr[i];
            index ++;
        }
        return reversedArray;
    }


}
