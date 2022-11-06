import java.util.*;

public class PrimeNumber{

    public static String cha(int iu){
        String result="";
        for(int i=2;i<iu-1;i++){       //Based on defination of prime number, use for-loop.
            if(iu%i==0){
                result="Your number is not prime";
                break;                          //two ways to get out of the loop.One is to use'break', the other is to let it go, waiting for the loop to finish its work.
            }
        }
        if(result!="Your number is not prime"){     //be careful about the logic, it's not hard,but easy to get wrong.
            result="Your number is prime";
        }
        return result;
    }




    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Please, insert a number:");
        int z;
        do{
            try{
                z = Integer.parseInt(sc.nextLine());      //check the type of the variable
                break;
            }catch(Exception e){
                System.out.println(e);
                System.out.println("Input again please:");
            }
        }while(true);

        if(z<=0){
            System.out.println("Prime number should be positive,see you~");
        }
        else{
            System.out.println(cha(z));                    //Call my function inside the bracket.
        }
    }
}
