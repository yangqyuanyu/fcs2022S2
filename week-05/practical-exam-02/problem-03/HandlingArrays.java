import java.util.*;
public class HandlingArrays {

    public static void printArray(double [] testArray) {
          System.out.println(Arrays.toString(testArray));           //print the array
     }


    public static double[] sumElements(double [] firstArray, double [] secondArray) {

          double[] result=new double[firstArray.length];
          firstArray=new double[firstArray.length];
          secondArray=new double[secondArray.length];
          if(secondArray.length!=firstArray.length){                                  //add two array with same length together
              throw new RuntimeException("Error - Arrays different shape");
          }else{
              for(int i=0;i<firstArray.length;i++){
                  result[i]=firstArray[i]+secondArray[i];
              }
          }

          return result;
     }



    public static double[] sumAnyArrays(double [] firstArray, double [] secondArray) {

        int num;
        firstArray=new double[firstArray.length];
        secondArray=new double[secondArray.length];
        if(firstArray.length<secondArray.length){
            num=secondArray.length;                                //add two array into one. no length restriction
        }else{
            num=firstArray.length;
        }
        double[] result=new double[num];
        for(int i=0;i<num;i++){
            result[i]=firstArray[i]+secondArray[i];
        }

        return result;
   }

    public static double[] maxArrays(double [] firstArray, double [] secondArray) {
        double[] result=new double[firstArray.length];
        firstArray=new double[firstArray.length];
        secondArray=new double[secondArray.length];
        if(firstArray.length!=secondArray.length){
            throw new RuntimeException("Error - Arrays different shape");
        }else{                                                                      //compare the corresponding double numbers in two arrays,and pick the bigger one
            for(int i=0;i<firstArray.length;i++){
                if(firstArray[0]<secondArray[0]){
                    result[i]=secondArray[i];
                }else{
                    result[i]=firstArray[i];
                }
            }
        }

        return result;
   }
}