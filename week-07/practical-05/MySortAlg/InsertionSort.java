import java.util.Arrays;
public class InsertionSort extends MySortAlg{

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
        int n = array.length;
        for (int i = 1; i < n; i++){   //By default the first element is sorted already, so i starts from 1
            int current=array[i];
            int j=i-1;              //i is the first element of the unsorted while j, at the very beginning, is the last one of the sorted 
      
            while (j >= 0 && array[j] > current) {
                array[j+1]=array[j];      //Aim: provide 'current' with insertion space (mustn't replace j+1 with i)
                j--;
            }
                array[j+1]=current;      //insert!!!
        }
        array=reverseArray(array);
        return array;

    
    }
}