import java.util.*;

public class problem{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a distance in miles: ");
        double input=sc.nextDouble();
        if(input<0||input>1000){
            System.out.printf("The distance %.2f is out of range",input);
        }else if(input>=0&&input<=1000){
            double convertion=1.6093*input;
            System.out.printf("The distance in kilometres is: %.2f km",convertion);
        }
    }
}
