import java.util.*;
public class Bubble_Sort{

    static void bubbleSort(int[] A){
        int n=A.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(A[j]>A[j+1]){
                   int temp;
                   temp=A[j];
                   A[j]=A[j+1];
                   A[j+1]=temp;

                }
            }
        }
    }
    public static void main(String[] args){
        int[] arr={1,3,2,5,7,4,6,6,9,10,8};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
