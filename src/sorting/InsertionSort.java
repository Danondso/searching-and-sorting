package sorting;

public class InsertionSort {

    //Takes O(n^2) for an array sorted in reverse order, O(n) if the array is sorted. Space complexity of O(1).
    //Incremental approach
    public static int[] insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            int key = arr[i]; //set the key
            int j = i - 1; // start at the 0th index of the array

        /* Move elements of arr[0..i-1], that are
           greater than key, to one position ahead
           of their current position */
            while(j >= 0 && arr[j] > key){ //everything greater than the key is shifted right one.
                arr[j + 1] = arr[j]; //shift everything to the right
                j = j - 1; //moves the index to the left
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}
