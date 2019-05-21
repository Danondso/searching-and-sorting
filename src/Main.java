import sorting.*;
import misc.FizzBuzz;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    private static int MAX_SIZE = 10;

    public static void main(String[] args) {

        int[] bubbleArr = generateArray(MAX_SIZE);
        System.out.println(Arrays.toString(bubbleArr));
        System.out.println(Arrays.toString(BubbleSort.bubbleSort(bubbleArr)));
        System.out.println();

        int[] insertionArr = generateArray(MAX_SIZE);
        System.out.println(Arrays.toString(insertionArr));
        System.out.println(Arrays.toString(SelectionSort.selectionSort(insertionArr)));
        System.out.println();

        InsertionSort insertionSort = new InsertionSort();

        int[] mergeArr = generateArray(MAX_SIZE);
        int[] helperArr = new int[mergeArr.length];
        System.out.println(Arrays.toString(mergeArr));
        MergeSort.mergeSort(mergeArr, helperArr, 0, mergeArr.length - 1);
        System.out.println(Arrays.toString(mergeArr));
        System.out.println();

        int[] quickArr = generateArray(MAX_SIZE);
        System.out.println(Arrays.toString(quickArr));
        System.out.println(Arrays.toString(QuickSort.quickSort(quickArr, 0, quickArr.length - 1)));
        System.out.println();

        //FizzBuzz.fizzBuzz(3, 5, 100);
    }

    private static int[] generateArray(int arraySize) {
        int[] arr = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(0, arraySize);
        }
        return arr;
    }
}
