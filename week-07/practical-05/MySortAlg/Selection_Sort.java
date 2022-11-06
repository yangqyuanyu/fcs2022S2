import java.util.*;
public class Selection_Sort {
	static void selectionSort(int[] arr) {
		int minIndex;
		for(int i = 0;i < arr.length;i++) {
			minIndex = i;

			for(int j = i;j < arr.length;j++) {
				if(arr[j] < arr[minIndex]) {           //find the minimum idx in the unsorted by using loop
					minIndex = j;
				}
			}


			if(minIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minIndex];      //若最小值下标与  "未排序中最左侧下标"  不一致则交换
				arr[minIndex] = temp;
			}
		}
	}


	public static void main(String[] args){
        int[] A={1,3,2,5,7,4,6,6,9,10,8};
        selectionSort(A);
        System.out.println(Arrays.toString(A));
    }

}
