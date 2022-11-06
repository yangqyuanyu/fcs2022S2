class LinearSearch extends MySearchAlg{
    public int search(int[] array,int num){     //implementation, using iteration
        for(int i=0;i<array.length;i++){
            if(array[i]==num){
                return i;
            }
        }
        return -1;                           //means the index couldn't be found
    }


}
