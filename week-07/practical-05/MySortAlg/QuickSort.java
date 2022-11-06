import java.util.Arrays;
public class QuickSort extends MySortAlg{
    private void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


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
        return (i + 1);     
    }





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
        int l=0;
        int h=array.length-1;
        quickSort(array,l,h);
        array=reverseArray(array);
        return array;
    }


}