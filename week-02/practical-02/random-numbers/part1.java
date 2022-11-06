import java.util.*;                                 //import pack

public class part1{
    public static void main(String args[]){
        Random r=new Random();
        long sum= 0;



        for(int i=0,number; i<10; i++){
            number=r.nextInt();
            while(number==0){
                number=r.nextInt();
            }

            if(number<0){
                number=Math.abs(number);
                System.out.println("Random Variable "+(i+1)+": "+number);
                sum +=number;
            }else{
                System.out.println("Random Variable "+(i+1)+": "+number);
                sum += number;
            }
        }


        System.out.println("sum : "+sum);
        System.out.println("the mean number is "+(double)(sum/10));
    }
}
