import java.util.*;

public class Problem04{
    public static void main(String args[]){
        Random r=new Random();    //create object
        int p,i,sum= 0;
        int number=0;
        for(i=1; i<=10; i++)
        {
            number=r.nextInt(20);
            System.out.print("Number("+number+"):");
            for(int j=0;j<number;j++){
                if(number>=10){             //compare with 10
                   System.out.print(">=");
                }else{
                   System.out.print("<");
                }
            }
            System.out.println();
            sum += number;
        }
        double mean=(double)sum/10;    // convert!!!
        System.out.print("Average("+Math.round(mean)+"):");
        for(p=0;p<Math.round(mean);p++){
                System.out.print("*");
        }
    }
}


