
import java.util.*;
class Quick_Sort{


    private void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /* This function takes last element as pivot, places
       the pivot element at its correct position in sorted
       array, and places all smaller (smaller than pivot)
       to left of pivot and all greater elements to right
       of pivot */
    private int partition(int[] arr, int low, int high){

        // pivot
        int pivot = arr[high];

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);

        for (int j = low; j <high; j++) {

            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot) {

                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);     //此时,i+1的位子是pivot
    }




    /* The main function that implements QuickSort
              arr[] --> Array to be sorted,
              low --> Starting index,
              high --> Ending index
     */
    private void quickSort(int[] arr, int low, int high){
        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }





    public int[] sort(int[] array){
        int l=0;
        int h=array.length-1;
        quickSort(array,l,h);
        // Collections.reverse(Arrays.asList(array));

        return array;
    }







    // main method for testing
    public static void main(String[] args)
    {
        int[] arr = {1,3,2,5,7,4,6,6,9,10,8};
        int n = arr.length;
        Quick_Sort ob=new Quick_Sort();
        // Arrays.sort(arr);
        System.out.println(Arrays.toString(ob.sort(arr)));
    }
}
