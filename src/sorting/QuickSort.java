package sorting;

public class QuickSort {

   public static int[] quickSort(int[] array, int low, int high) {
        if(low < high) {
            int partitionIndex = paritionByLow(array, low, high);

            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
        return array;
    }

    //TODO understand how partition is working
    private static int partitionByHigh(int[] array, int low, int high){
        int pivot = array[high]; //get the value for the end
        int i = low - 1;

        for(int j = low; j <= high - 1; j++) {
            if(array[j] <= pivot) {
                i++;
                SortUtil.swap(array, i, j);
            }
        }
        SortUtil.swap(array, i + 1, high);
        return i + 1;
    }

    private static int paritionByLow(int[] array, int low, int high) {
       int pivot = array[low];
       int i = high + 1;

       for(int j = high; j > low; j--){
           if(array[j] >= pivot) { //to change the ordering, simply reverse this if statement
               i--;
               SortUtil.swap(array, i, j);
           }
       }
       SortUtil.swap(array, i - 1, low);
       return i - 1;
    }

    private static int partitionByMiddle(int[] array, int low, int high) {
       return 0;
       //TODO create parition by middle
    }

}
