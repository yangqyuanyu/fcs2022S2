import java.util.*;
class Insertion_Sort {

    void insertionSort(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; i++) {   //第一个元素默认已排序,故i从1开始
            int current=arr[i];
            int j=i-1;              //i为未排序首项,j 初始 为已排序末项



            while (j >= 0 && arr[j] > current) {
                arr[j+1]=arr[j];      //Aim: 向后挪位,为current提供插入空间 (mustn't replace j+1 with i)
                j--;   //此乃挪位也~
            }
            arr[j+1]=current;      //insert!!!
        }
    }





    // main method for testing
    public static void main(String args[])
    {
        int[] IU={1,3,2,5,7,4,6,6,9,10,8};

        Insertion_Sort ob = new Insertion_Sort();
        ob.insertionSort(IU);

        System.out.println(Arrays.toString(IU));
    }
}



/*在从后向前扫描过程中，需要反复把已排序元素
  逐步向后挪位，为最新元素提供插入空间。   */