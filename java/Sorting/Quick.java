package Sorting;

class QuickSort {
    public static void main(String[] args) {
        int[] array = { 64, 34, 25, 12, 22, 11, 90, 80 };
        int low = 0;
        int high = array.length - 1;
        try {
            quickSort(array, low, high);
            System.out.println("Sorted array:");
            printArray(array);
        } catch (Exception e) {
            System.out.println("We Get Error Array Out Of Bound" + e.getMessage());
        }

    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);

        }

    }

    public static int partition(int[] array, int low, int high) {
        // 1. Pick the LAST element as pivot to match your 'i = low-1' logic
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                // 2. SWAP MUST BE INSIDE THE IF BLOCK
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // 3. Move pivot to its correct spot (i + 1)
        int temp = array[i + 1];
        array[i + 1] = array[high]; // high is where our pivot was stored
        array[high] = temp;

        return i + 1; // Return the pivot's final position
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

/*
 * Dougth
 * Why low - 1?
 * At the very start, we haven't found any elements smaller than the pivot yet.
 * * If low is 0, then i becomes -1.
 * 
 * A value of -1 literally means: "The 'Small Elements Zone' is currently empty.
 * 
 * Dought 2 :
 * so when we swap is donw of i
 * then i get the pivot is in first position but afferting swapping the
 * we need to transfer pivot ele to there right place , & i get the sorted array
 * in right part
 * so we need to transfer -: positino of current sorted pointer index is i ; and
 * pivopt element index is array[low] swapp the array[low ] to i +1 postion
 * elemment
 * 
 */