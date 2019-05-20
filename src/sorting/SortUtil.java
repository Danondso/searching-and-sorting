package sorting;

import java.util.concurrent.ThreadLocalRandom;

public class SortUtil {
    static int[] swap(int [] arr, int i, int minIndex) {
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
        return arr;
    }
}
