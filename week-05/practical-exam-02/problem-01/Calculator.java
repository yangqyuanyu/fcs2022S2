//==================================
// Foundations of Computer Science
// Student: Yang Quanyu
// id: 1874869
// Semester:2
// Year:2022
// Practical Exam Number:2
//===================================


import java.util.*;

public class Calculator {

    public static int sum(int numA, int numB){
        int result;
        result=numA+numB;                            //creat a new method called sum
        return result;
    }

    public static float cube(float num){
        float result;                               //creat a method called cube
        result=num*num*num;
        return result;
    }

    public static float division(float numA, float numB){
        float result;
        if(numB==0){
            result=(float)-99.9;
        }else{                                       //create a method called division
            result=numA/numB;
        }
        return result;
    }

}