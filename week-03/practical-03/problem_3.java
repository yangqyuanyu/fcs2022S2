import java.util.*;

public class Comparison{

    static double comp(double num_1, double num_2){      //create a function to compare two numbers
        double result;
        Random r=new Random();
        double[] arr ={num_1,num_2};
        if(arr[0]<arr[1]){                              //It not neccesary to use array here, as there are only 2 index. But it may look elegant if I do so.
            result=arr[1];
        }else if(arr[1]<arr[0]){
            result=arr[0];
        }else{
            result=arr[r.nextInt(2)];
        }

        return result;
    }



    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Please,insert a number:");
        double x = sc.nextDouble();
        sc.nextLine();
        System.out.print("Please,insert a number:");
        double y = sc.nextDouble();
        sc.nextLine();
        if(x==y){
            System.out.print("These two are identical");
        }else{System.out.print("The 'bigger' number is "+comp(x,y));}
                                                                               //call the function mentioned above
    }
}
