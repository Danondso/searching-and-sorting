package sorting;

import static sorting.SortUtil.swap;

public class SelectionSort {

    //takes a sub array of the values for each i iteration and finds the minimum, then swaps once a minimum index has been found
    //Time complexity O(n^2), O(n) if already sorted. Space complexity is O(1).
    public static int[] selectionSort(int[] arr) {
        int length = arr.length;
        for(int i = 0; i < arr.length - 1; i++) {
            int minIndex = i; // set the min index we're working with
            for(int j = i + 1; j < length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j; // find the minimum within the sub array
                }
            }
          swap(arr, i, minIndex); //override the array with the swap ya dummy!
        }
        return arr;
    }
}
