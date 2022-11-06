import java.util.*;
class BinarySearch extends MySearchAlg{
    public int rankIndex(int[] array,int num){
        Arrays.sort(array);
        int low=0;
        int high=array.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(num==array[mid]){
                return mid;
            }else if(num<array[mid]){        //skip the right-hand side
                high=mid-1;
            }else{                          //skip the left-hand side
                low=mid+1;
            }
        }
        return -1;                      //counldn't find the index number
    }



    public int search(int[] array,int num){
        int[] clone_arr=new int[array.length];
        for(int i=0;i<array.length;++i){
            clone_arr[i]=array[i];
        }

        int rank_idx;
        rank_idx=rankIndex(array,num);
        if(rank_idx==-1){
            return -1;
        }

        // System.out.println("The original input array: "Arrays.toString(array));



        int[] index=new int[array.length];
        for(int i=0;i<array.length;i++){
            index[i]=i;
        }

        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(clone_arr[j]>clone_arr[j+1]){
                   int temp;
                   temp=clone_arr[j];
                   clone_arr[j]=clone_arr[j+1];
                   clone_arr[j+1]=temp;

                   int temp_idx;
                   temp_idx=index[j];
                   index[j]=index[j+1];
                   index[j+1]=temp_idx;
                }
            }
        }



        return index[rank_idx];


    }
}
