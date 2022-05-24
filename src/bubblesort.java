class bubblesort {
    static void bubblesort(int array[])
    {
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength - 1; i++)
            for (int j = 0; j < arrayLength - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

//    this prints the array that bubblesort has sorted
    static void bubblePrint(int array[])
    {
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }
////
//    hardcoding an array to make sure the code works
    public static void main(String args[])
    {
        bubblesort example = new bubblesort();
        int testArray[] = { 33, 7, 23, 10, 21, 2007, 1988 };
        example.bubblesort(testArray);
        System.out.println("Sorted array");
        example.bubblePrint(testArray);
    }
}