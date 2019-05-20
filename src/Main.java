import sorting.BubbleSort;
import sorting.MergeSort;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static int MAX_SIZE = 10000;

    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();
        int[] bubbleArr = generateArray(MAX_SIZE);
        //System.out.println(Arrays.toString(bubbleArr));
        // System.out.println(Arrays.toString(bubbleSort.bubbleSort(bubbleArr)));
        System.out.println();

//        SelectionSort selectionSort = new SelectionSort();
//        int[] insertionArr = generateArray(MAX_SIZE);
//        System.out.println(Arrays.toString(insertionArr));
//        System.out.println(Arrays.toString(selectionSort.selectionSort(insertionArr)));
//
//        InsertionSort insertionSort = new InsertionSort();


        MergeSort mergeSort = new MergeSort();

//        int[] mergeArr = generateArray(MAX_SIZE);
//        int[] helperArr = new int[mergeArr.length];
//        System.out.println(Arrays.toString(mergeArr));
//        mergeSort.mergeSort(mergeArr, helperArr, 0, mergeArr.length - 1);
//        System.out.println(Arrays.toString(mergeArr));

        fizzBuzz(3, 5);
    }
    //Runs in O(n) time with O(1) complexity; such wow
    public static void fizzBuzz(int value1, int value2) {

        for(int i = 1; i <= 100; i++) {
            if(i % value1 == 0 && i % value2 == 0){
                System.out.println("FizzBuzz");
                //continue isn't needed in an if else, it breaks out when it falls into a block.
            } else if(i % value1 == 0)
                System.out.println("Fizz");
              else if(i % value2 == 0)
                System.out.println("Buzz");
              else {
                  System.out.println(i);
            }
        }
    }


    static int[] generateArray(int arraySize) {
        int[] arr = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(0, arraySize);
        }
        return arr;
    }
}
