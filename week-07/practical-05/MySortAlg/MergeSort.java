import java.util.Arrays;
public class MergeSort extends MySortAlg{

    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    private void merge(int arr[], int l, int m, int r)
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





    private void mergeSort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;     //what if 4.5 ?

            // Sort first and second halves respectively
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    private int[] reverseArray(int[] arr){
        int q=arr.length;
        int[] result=new int[q];
        for(int min=0,max=arr.length-1;min<=max;min++,max--){
            int temp=arr[min];
            arr[min]=arr[max];
            arr[max]=temp;
            result=arr;
        }
        return result;
    }

    public int[] sort(int[] array){
        int l = 0;
        int r = array.length-1;
        mergeSort(array, l, r);
        array=reverseArray(array);
        return array;
    }




}