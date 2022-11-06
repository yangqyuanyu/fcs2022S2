import java.util.*;
public class Problem01{
    public static void main(String args[]){
        Random r=new Random();                    //create object
        int p,i,sum= 0;
        int number=0;
        for(i=1; i<=10; i++){                      //use for-loop to get 10 numbers randomly

            number=r.nextInt(21);                //attention! 20 is wrong!
            System.out.print("Number("+number+"):");
            for(int j=0;j<number;j++){
                System.out.print("*");
                }
            System.out.println();
        }
    }
}