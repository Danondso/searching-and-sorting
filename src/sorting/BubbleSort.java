package sorting;

import static sorting.SortUtil.swap;

public class BubbleSort {

    /*
     * Basic bubble sorting: for each i in the array, swap if the value of the array at index j is less than.
     * We're breaking this early so we can avoid having to run through the array needlessly.
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     * */

    public static int[] bubbleSort(int[] arr) {
        int swapsDuringPass = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapsDuringPass++;
                }
            }
            if (swapsDuringPass == 0) //indicates there's nothing else to sort in the array, so we can short circuit the parent loop
                break;
            swapsDuringPass = 0;
        }
        return arr;
    }
}
