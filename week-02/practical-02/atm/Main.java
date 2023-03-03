import java.util.Scanner;
public class Main{
    public static String run(double numz){
        String result="";
        if(numz%20==0){
            if(numz==20){
                return "here is 1 $20 note";
            }else{
                return "here is "+(int)(numz/20)+" $20 notes";
            }
        }
        if(numz%50==0){
            if(numz==50){
                return "here is 1 $50 note";
            }else{
                return "here is "+(int)(numz/50)+" $50 notes";
            }
        }



o:      for(int numx=0;numx<0.05*numz;numx++){
            for(int numy=0;numy<0.02*numz;numy++){
                int sum=20*numx+50*numy;
                if(numz==sum){
                    result="here is "+numx+" $20 notes and "+numy+" $50 notes";
                    break o;
                }
                else{
                    result="Sorry, the value you input cannot be withdrew";
                }
            }
        }
        return result;
    }




    public static void main(String []args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Input here:");
            double z=sc.nextDouble();
            System.out.println(run(z));
        }
    }
}

