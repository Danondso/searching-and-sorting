import search.BinarySearch;
import sorting.*;
import misc.FizzBuzz;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    private static int MAX_SIZE = 100;

    public static void main(String[] args) {

//        int[] bubbleArr = generateArray(MAX_SIZE);
//        System.out.println(Arrays.toString(bubbleArr));
//        System.out.println(Arrays.toString(BubbleSort.bubbleSort(bubbleArr)));
//        System.out.println();
//
//        int[] insertionArr = generateArray(MAX_SIZE);
//        System.out.println(Arrays.toString(insertionArr));
//        System.out.println(Arrays.toString(SelectionSort.selectionSort(insertionArr)));
//        System.out.println();
//
//        int[] mergeArr = generateArray(MAX_SIZE);
//        int[] helperArr = new int[mergeArr.length];
//        System.out.println(Arrays.toString(mergeArr));
//        MergeSort.mergeSort(mergeArr, helperArr, 0, mergeArr.length - 1);
//        System.out.println(Arrays.toString(mergeArr));
//        System.out.println();
//
//        int[] quickArr = generateArray(MAX_SIZE);
//        System.out.println(Arrays.toString(quickArr));
//        System.out.println(Arrays.toString(QuickSort.quickSort(quickArr, 0, quickArr.length - 1)));
//        System.out.println();
//
//        int[] insertionArr = generateArray(MAX_SIZE);
//        System.out.println(Arrays.toString(insertionArr));
//        System.out.println(Arrays.toString(InsertionSort.insertionSort(insertionArr)));
//        System.out.println();
//
//        System.out.println(Arrays.toString(quickArr));
//        System.out.println("Index of " + quickArr[10] + " found at index " + BinarySearch.binarySearch(quickArr[10], quickArr, 0, quickArr.length - 1));

        //FizzBuzz.fizzBuzz(3, 5, 100);

        int[] element_array = { 2, 7, 3, 9, 4 };

        System.out.println(findLCM(element_array));
    }

    private static int[] generateArray(int arraySize) {
        int[] arr = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(0, arraySize);
        }
        return arr;
    }

    static int findLCM(int[] array){
        int result = array[0];
        for(int i = 0; i < array.length; i++) {
            result = (result * array[i]) / gcd(result, array[i]);
        }
        return result;
    }

    static int gcd(int a, int b) {
        if(a == 0)
            return b;
        return gcd(b % a, a);
    }
    static int findGCD(int[] array) {
        int result = array[0];
        for(int i = 0; i < array.length; i++) {
            result = gcd(result, array[i]); //takes the gcd of all the numbers
        }
        return result;
    }


}
