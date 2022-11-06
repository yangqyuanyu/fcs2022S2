import java.util.Arrays;
import java.io.*;
import java.lang.Exception;
import java.lang.Object;


public class Main{
    private static boolean test(int result,int ans){
        return result==ans;
    }

    private static int MaxElement(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    private static int findMaxVal(int array[]){
        int[] copy_arr=new int[array.length];
        for(int i=0;i<array.length;++i){
            copy_arr[i]=array[i];
        }
        int max_element=MaxElement(array);
        LinearSearch ls=new LinearSearch();
        return ls.search(copy_arr,max_element);
    }








    public static void main(String[] args) throws Exception{
        int num1,num2,num3,ans1,result1,ans2,result2,ans3,result3;
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        BinarySearch bs=new BinarySearch();
        LinearSearch ls=new LinearSearch();

        int[] test1={1,2,3,4,5,6,7};
        int[] test2={1,9,10,8,-5,3,2,-110};
        int[] test3={2,4,9,0,5,-1,22};


        System.out.println(Arrays.toString(test1));
        System.out.println("what number u want to find: ");
        do{
            try{                                                   //try-catch
                num1= Integer.parseInt(rd.readLine());             //IO Stream
                break;
            }catch(Exception e){
                System.out.println("Input again please:");
            }
        }while(true);
        System.out.println("Set its index number as answer :");
        do{
            try{                                                   //try-catch
                ans1= Integer.parseInt(rd.readLine());             //IO Stream
                break;
            }catch(Exception e){
                System.out.println("Input again please:");
            }
        }while(true);
        result1=bs.search(test1,num1);
        System.out.println(test(result1,ans1));


        System.out.println(Arrays.toString(test2));
        System.out.println("what number u want to find: ");
        do{
            try{                                                   //try-catch
                num2= Integer.parseInt(rd.readLine());             //IO Stream
                break;
            }catch(Exception e){
                System.out.println("Input again please:");
            }
        }while(true);
        System.out.println("Set its index number as answer :");
        do{
            try{                                                   //try-catch
                ans2= Integer.parseInt(rd.readLine());             //IO Stream
                break;
            }catch(Exception e){
                System.out.println("Input again please:");
            }
        }while(true);
        result2=ls.search(test2,num2);
        System.out.println(test(result2,ans2));

        System.out.println(Arrays.toString(test3));
        System.out.println("what number u want to find: ");
        do{
            try{                                                   //try-catch
                num3= Integer.parseInt(rd.readLine());             //IO Stream
                break;
            }catch(Exception e){
                System.out.println("Input again please:");
            }
        }while(true);
        System.out.println("Set its index number as answer :");
        do{
            try{                                                   //try-catch
                ans3= Integer.parseInt(rd.readLine());             //IO Stream
                break;
            }catch(Exception e){
                System.out.println("Input again please:");
            }
        }while(true);
        result3=bs.search(test3,num3);
        System.out.println(test(result3,ans3));




        int[] testMax={1,3,5,30,6,-35,-666};
        System.out.println("testMax="+Arrays.toString(testMax));
        System.out.println(findMaxVal(testMax));
    }
}