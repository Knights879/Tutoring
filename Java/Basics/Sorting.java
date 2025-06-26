/**
 * @author Knights879
 */
public class Sorting {
    /**
     * Main method
     * Method header: public static void main(String[] args)
     * Method signature: main(String[])
     * @param args
     */
    public static void main(String[] args) {
        int[] myArray = { 8, 1, 5, 2, 3, 7, 6, 9, 4, 0 };

        // System.out.println("-----Selection Sort-----");
        // System.err.print("Unsorted array: ");
        // printArray(myArray);
        // selectionSort(myArray);
        // System.err.print("Sorted array: ");
        // printArray(myArray);
        // System.out.println();

        // System.out.println("-----Insertion Sort-----");
        // System.err.print("Unsorted array: ");
        // printArray(myArray);
        // insertionSort(myArray);
        // System.err.print("Sorted array: ");
        // printArray(myArray);
        // System.out.println();

        System.out.println("-----Merge Sort-----");
        System.err.print("Unsorted array: ");
        printArray(myArray);
        mergeSort(myArray, 0, myArray.length - 1);
        System.err.print("Sorted array: ");
        printArray(myArray);
        System.out.println();

        // System.out.println("-----QuickSort-----");
        // System.err.print("Unsorted array: ");
        // printArray(myArray);
        // quickSort(myArray);
        // System.err.print("Sorted array: ");
        // printArray(myArray);
        // System.out.println();
    }

    /* MUTATOR METHODS */

    /**
     * Sorts the given array, 'arr', using Selection sort
     * Selection sort: Sorts the array one element at a time. Start with the sorted section
     * on the left (initially empty) and the unsorted on the right (initially full). In each pass,
     * look through each element in the unsorted subarray to find the smallest available element.
     * Swap the smallest available element with the first element in the unsorted subarray. Now,
     * that element is sorted and apart of the sorted subarray. Continue this process until the
     * sorted subarray is full and the unsorted subarray is empty.
     * @param arr the array to be sorted
     */
    public static void selectionSort(int[] arr) {
        int len = arr.length;  // So that we aren't calculating it every time we loop!!!

        // Move the boundary between the sorted and unsorted subarrays to the right with each pass.
        // The boundary is just before the current index. Start with 'index = 0' so that the entire
        // array starts out in the unsorted section. End with 'index = len - 2' because after this
        // pass, there will be one element left in the unsorted section, but it is the last element
        // left and therefore is already sorted (nothing left to compare it with).
        for (int i = 0; i < len - 1; i++) {
            // 1. Find the minimum available element
            // Set the current element to the min
            int minIndex = i;
            // Loop through the rest of the unsorted subarray and compare each element to 'min'.
            // If the current element is less than 'min', make it the new 'min'
            for (int j = i + 1; j < len; j++)
                if (arr[j] < arr[minIndex])
                    minIndex = j;

            // 2. Swap the current element with the minimum element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            // 3. NOT THE ALGORITHM -- OPTIONAL -- Print the array after the current pass.
            System.out.println("On " + i + " pass: " + "Swap index = " + i + ", Min index = " + minIndex);
            System.out.print("After " + i + " pass: ");
            printArray(arr);
        }
    }

    /**
     * Sorts the given array, 'arr', using Insertion sort
     * Insertion sort: Sorts the array one element at a time. Start with the sorted section
     * on the left and the unsorted on the right. The first element starts in the sorted section,
     * as it is sorted with respect to itself, and all other elements start in the unsorted section.
     * In each pass, continue comparing, and swapping, the current element with the element to the
     * left until the current element is greater than the left element. Continue this process until
     * you have looked at each element.
     * @param arr the array to be sorted
     */
    public static void insertionSort(int[] arr) {
        int len = arr.length;

        // Move the boundary between the sorted and unsorted subarrays to the right with each pass.
        // The boundary is just before the current index. Start with 'index = 1' so that the first
        // element is already in the sorted section. End with 'index = len - 1' because this
        // represents the last element to be sorted.
        for (int i = 1; i < len; i++) {
            // 1. Create the second index to the left of the current index and save the value
            // of the current element.
            int j = i - 1;
            int currentValue = arr[i];

            // 2. Keep looping while the current element is less than the element to the left.
            while (j >= 0 && arr[j] > currentValue) {
                // Move the left element to the current element
                arr[j + 1] = arr[j];
                j--;
            }

            // 3. Now that the greater numbers have been shifted, put the current element at the
            // end of the sorted section.
            arr[j + 1] = currentValue;

            // 4. NOT THE ALGORITHM -- OPTIONAL -- Print the array after the current pass.
            System.out.print("After " + i + " pass: ");
            printArray(arr);
        }
    }

    /**
     * Sorts the given array, 'arr', using Merge sort
     * Merge sort: Sorts using recursion. Start by recursively breaking the array into halves until
     * each element is in it's own subarray (one element is sorted with respect to itself). Then
     * merge together adjacent sorted arrays into one single sorted array.
     * Sorts arr[left...right] using merge()
     * @param arr the array to be sorted
     */
    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            // 1. Find the middle point
            int m = l + (r - l) / 2;

            // 2. Spilt the array in half
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // 3. Merge the sorted halves back together
            merge(arr, l, m, r);
        }
    }

    /**
     * Helper function for mergeSort()
     * Merges the sorted arrays arr[l...m] and arr[m...r]. Sorts the arrays as it merges them
     * @param arr the array to be sorted
     * @param l the left index
     * @param m the middle index
     * @param r the right index
     */
    public static void merge(int[] arr, int l, int m, int r) {
        int len1 = m - l + 1;
        int len2 = r - m;

        // 1. Create temp arrays for sorting later.
        int[] left = new int[len1];
        int[] right = new int[len2];
        // Use the temp arrays to make a copy
        for (int i = 0; i < len1; i++)
            left[i] = arr[l + i];
        for (int j = 0; j < len2; j++)
            right[j] = arr[m + 1 + j];

        // 2. Merge the two halves together
        int i = 0;  // index for the left subarray
        int j = 0;  // index for the right subarray
        int k = l;  // index for the merged subarray

        // Keep looping until one of the subarrays are empty. On each pass, choose the smaller
        // element of the left and right subarrays, place it in the merged array, then
        // move the subarray that was picked to the next element.
        while (i < len1 && j < len2) {
            if (left[i] <= right[j])
                arr[k] = left[i++];
            else
                arr[k] = right[j++];
            k++;
        }

        // Copy any remaining elements from the left subarray
        while (i < len1)
            arr[k++] = left[i++];
        // Copy any remaining elements from the right subarray
        while (j < len2)
            arr[k++] = right[j++];

        // NOT THE ALGORITHM -- OPTIONAL -- Print the array after the current pass.
        System.out.print("After pass: ");
        printArray(arr);
    }

    /**
     * Sorts the given array, 'arr', using QuickSort
     * @param arr the array to be sorted
     */
    public static void quickSort(int[] arr) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not yet implemented.");
    }

    /* ACCESSOR METHODS */

    /**
     * Prints the given array, 'arr', to the console
     * @param arr
     */
    public static void printArray(int[] arr) {
        int len = arr.length;  // So that we aren't calculating it every time we loop!!!

        for (int i = 0; i < len; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}
