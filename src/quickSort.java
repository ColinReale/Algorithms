class quickSort {

    // A utility function to swap two elements
    static void swap(int[] array, int i, int j) {
        int iteration = array[i];
        array[i] = array[j];
        array[j] = iteration;
    }

    static int partition(int[] array, int low, int high) {


        int pivot = array[high];

        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
//                 conditional statement that will increase the i of the smaller element when compared to the pivot
            if (array[j] < pivot) {

                // Increment index of
                // smaller element
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return (i + 1);
    }


    static void quickSort(int[] arr, int low, int high) {
//        if the start index is less than the end index, then we run the partition method from above
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
//            This sorts the elements before and after the partition
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }
}
