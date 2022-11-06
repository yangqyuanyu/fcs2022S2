import java.lang.Exception;
import java.util.*;
import java.io.*;
public class Main{

    public static boolean test(int[] result, int[] ans){
        int n1=result.length;
        int n2=ans.length;
        if(!(n1==n2)){
            return false;
        }else{
            for(int i=0;i<n1;i++){
                if(result[i]!=ans[i]){
                    return false;
                }
            }
            return true;
        }
    }


    public static boolean compare(int[] arr1, int[] arr2){
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr1);
        Arrays.sort(arr2);                          //Arrays class
        int n1=arr1.length;
        int n2=arr2.length;
        if(!(n1==n2)){
            return false;
        }else{
            for(int i=0;i<n1;i++){
                if(arr1[i]!=arr2[i]){
                    return false;
                }
            }
            return true;
        }
    }

    public static int findSmallestSum(int[] array){
        int n=array.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(array[j]>array[j+1]){
                   int temp;
                   temp=array[j];
                   array[j]=array[j+1];
                   array[j+1]=temp;

                }
            }
        }
        int sum=array[0]+array[1];
        return sum;
    }

    public static void main(String[] args) throws Exception{
        InsertionSort is=new InsertionSort();
        MergeSort ms=new MergeSort();    
        QuickSort qs=new QuickSort();         //get the reference variables

        int[] test1={2,5,9,30,4,3};
        int[] ans1={30,9,5,4,3,2};
        int[] result1=is.sort(test1);
        System.out.println("result_1 :"+Arrays.toString(result1));

        int[] test2={1,3,5,7,2,9,1};
        int[] ans2={9,7,5,3,2,1,1};
        int[] result2=ms.sort(test2);
        System.out.println("result_2 :"+Arrays.toString(result2));

        int[] test3={-1,520,520,2,3,4,5,7,0,6};
        int[] ans3={520,520,7,6,5,4,3,2,0,-1};
        int[] result3=qs.sort(test3);
        System.out.println("result_3 :"+Arrays.toString(result3));

        System.out.println("Let's check inserton sort, merge sort, and quick sort one after another !");

        System.out.println("Insertion Sort Alg: "+test(result1,ans1));
        System.out.println("Merge Sort Alg: "+test(result2,ans2));       
        System.out.println("Quick Sort Alg: "+test(result3,ans3));






        System.out.println("Then, let's compare two array!");
        int[] taylor={1,9,8,9};                                                          //test compare method
        int[] swift={9,9,8,1};
        System.out.println(compare(taylor,swift));





        System.out.println("The smallest sum of two elements in "+Arrays.toString(test1)+"\n"+"is "+findSmallestSum(test1));      //test findSmallestSum method
        System.out.println("The smallest sum of two elements in "+Arrays.toString(test2)+"\n"+"is "+findSmallestSum(test2)); 
        System.out.println("The smallest sum of two elements in "+Arrays.toString(test3)+"\n"+"is "+findSmallestSum(test3)); 

        System.out.println("Input 4 integers to build a new array for testing !");
        int newArray[]=new int[4];
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));         // IO Stream, user input
        for(int i=0; i<4;i++){
            do{
                try
                {
                    newArray[i]= Integer.parseInt(rd.readLine());          
                    break;                                         
                }                                                                      //try-catch
                catch(Exception e) {
                    System.out.println(e);
                    System.out.println("Input again please:");
                }
            }while(true);
        }

        System.out.println("The smallest sum of two elements in "+Arrays.toString(newArray)+"\n"+"is "+findSmallestSum(newArray)); 

    }
}