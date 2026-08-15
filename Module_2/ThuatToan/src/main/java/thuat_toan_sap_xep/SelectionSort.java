package thuat_toan_sap_xep;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 10, 7, 2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int indexOfMin = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j] < arr[indexOfMin]) {
                    indexOfMin = j;
                }
            }
            int temp = arr[indexOfMin];
            arr[indexOfMin] = arr[i];
            arr[i] = temp;
        }
    }
}
