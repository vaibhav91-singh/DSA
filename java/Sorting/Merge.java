public class MergeSort {

    public static void main(String[] args) {
        // Fixed syntax: use { } for array initialization
        int array[] = {12, 34, 23, 45, 34, 23, 56, 4, 98, 6, 45, 4};
        
        System.out.println("Original Array:");
        printarray(array);
        
        mergeSort(array);
        
        System.out.println("\nSorted Array:");
        printarray(array);
    }

    public static void mergeSort(int[] array) {
        int n = array.length;
        if (n < 2) {
            return; // Base case: array is already "sorted"
        }

        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        // Fill the left subarray
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        // Fill the right subarray
        for (int i = mid; i < n; i++) {
            right[i - mid] = array[i];
        }

        // Recursive calls to split further
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves back together
        merge(array, left, right);
    }

    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Compare elements from left and right and move the smaller one to array
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Clean up remaining elements in left (if any)
        while (i < left.length) {
            array[k++] = left[i++];
        }

        // Clean up remaining elements in right (if any)
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    public static void printarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
