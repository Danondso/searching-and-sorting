package search;

public class BinarySearch {

    public static int binarySearch(int numToSearchBy, int[] array, int low, int high){
        if(high >= low) {
            int middle = low + (high - low) / 2;
            if (array[middle] == numToSearchBy)
                return middle;
            else if (numToSearchBy > array[middle])
                return binarySearch(numToSearchBy, array, middle + 1, high);
            else return binarySearch(numToSearchBy, array, low, middle - 1);
        }
        return -1;
    }
}
