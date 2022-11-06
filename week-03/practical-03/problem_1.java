import java.util.*;

public class BaseOperations{


    static void printArray(int[] array){           //void stays at the spot of variables?
        for (int element:array){                   //no result returned for'void function'
            System.out.print(element);
        }
    }


    protected static int[] reverseArray(int[] arr,int q){
        int[] result=new int[q];
        for(int min=0,max=arr.length-1;min<=max;min++,max--){
            int temp=arr[min];
            arr[min]=arr[max];
            arr[max]=temp;
            result=arr;                               //If I intend to swap data in two different spots, I need to use another container for transfer.
        }
        return result;
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many integers you intend to put in: ");
        int p=sc.nextInt();
        int[] array=new int[p];
        for(int i=0,j=1;i<array.length;i++,j++){
            System.out.print("Integer"+j+":");
            array[i]=sc.nextInt();
            sc.nextLine();
        }
        printArray(array);                              //call 'print' method
        sc.nextLine();
        array=reverseArray(array,p);                   //call the 'reverse' method
        printArray(array);
    }

}