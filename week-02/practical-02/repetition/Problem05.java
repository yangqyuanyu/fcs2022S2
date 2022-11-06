import java.util.*;

public class Problem05{



    public static char classify(long num){             //create a new function on my own. It's used to label numbers.
            char result;
            if(num<=5){
                   result='o';
                }else if(num<=10){
                   result='x';
                }else if(num<=15){
                   result='s';
                }else{
                   result='*';
                }
            return result;
         }




    public static void main(String args[]){
        Random r=new Random();
        int p,i,sum= 0;
        int number=0;
        for(i=1; i<=10; i++)
        {
            number=r.nextInt(21);
            System.out.print("Number("+number+"):");
            for(int j=0;j<number;j++){
                if(number<=5){
                   System.out.print("o");
                }else if(number<=10){
                   System.out.print("x");
                }else if(number<=15){
                    System.out.print("s");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
            sum += number;
        }
        double mean=(double)sum/10;
        long Mr=Math.round(mean);
        System.out.print("Average("+Mr+"):");

   /*     for(p=0;p<Mr;p++){
                switch(Mr){
                    case 0:
                        System.out.print("o");
                        break;
                    case 1:                              foul solution  lol !!!!!
                        System.out.print("o");
                        break;
                    case 2:
                        System.out.print("o");
                        break;
                    case 3:
                        System.out.print("o");
                        break;
                    case 4:
                        System.out.print("o");
                        break;
                    case 5:
                        System.out.print("o");
                        break;
                    case 6:
                        System.out.print("x");
                        break;
                    case 7:
                        System.out.print("x");
                        break;
                    case 8:
                        System.out.print("x");
                        break;
                    case 9:
                        System.out.print("x");
                        break;
                    case 10:
                        System.out.print("x");
                        break;
                    case 11:
                        System.out.print("s");
                        break;
                    case 12:
                        System.out.print("s");
                        break;
                    case 13:
                        System.out.print("s");
                        break;
                    case 14:
                        System.out.print("s");
                        break;
                    case 15:
                        System.out.print("s");
                        break;
                    case 16:
                        System.out.print("*");
                        break;
                    case 17:
                        System.out.print("*");
                        break;
                    case 18:
                        System.out.print("*");
                        break;
                    case 19:
                        System.out.print("*");
                        break;
                    case 20:
                        System.out.print("*");
                        break;
              }
         }                   Hello,tutor Su! I used switch-case controll in this stupid way at the very beginning, and it showed that there are errors about compatibility. But I just had no idea how to adjust my code.  */

         char classification = classify(Mr);       //call the function done by me to classify numbers based on their ranges.

         switch(classification){
            case 'o':
                for(int j=0;j<Mr;j++){
                    System.out.print('o');
                }
                break;
            case 'x':
                for(int j=0;j<Mr;j++){
                    System.out.print('x');
                }
                break;
            case 's':
                for(int j=0;j<Mr;j++){
                    System.out.print('s');
                }
                break;
            case '*':
                for(int j=0;j<Mr;j++){
                    System.out.print('*');
                }
                break;                               //default is optional

         }
    }
}

