import java.util.Collections;
import java.util.Arrays;
class Merge_Sort{
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;   //not 1 , is l
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];                  //Don't worry about the order. L/R array here is already
            i++;                            //sorted, cuz the elements inside are merged, and thus compared previously.
            k++;                            //illustration:  https://www.geeksforgeeks.org/merge-sort/
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }





    // Main function that sorts arr[l..r] using merge()
    void mergeSort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle pointe
            int m = l + (r - l) / 2;     //what if 4.5 ?

            // Sort first and second halves respectively
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

















    // main method for testing
    public static void main(String args[])
    {
        int[] IU={1,3,2,5,7,4,6,6,9,10,8};


        Merge_Sort ob = new Merge_Sort();
        ob.mergeSort(IU, 0, IU.length - 1);


        System.out.println(Arrays.toString(IU));
    }
}
