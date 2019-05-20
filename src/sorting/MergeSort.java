package sorting;

public class MergeSort {

    public int[] mergeSort(int[] arr, int[] helper, int low, int high) {
        if(low < high) {
            int midPoint = (low + high) / 2;
            mergeSort(arr, helper, low, midPoint);
            mergeSort(arr, helper, midPoint + 1, high);
            merge(arr, helper, low, midPoint, high);
        }
        return arr;
    }

    private void merge(int[] array, int[] helper, int low, int middle, int high){

        for(int i = low; i <= high; i++) {
            helper[i] = array[i];
        }

        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;

        while(helperLeft <= middle && helperRight <= high) {
            if(helper[helperLeft] <= helper[helperRight]) {
                array[current] = helper[helperLeft];
                helperLeft++;
            } else {
                array[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }

        int remaining = middle - helperLeft;

        for(int i = 0; i <= remaining; i++) {
            array[current + i] = helper[helperLeft + i];
        }
    }
}
