import java.util.*;


public class userinterface{

    public static double sum(double number_1, double number_2){
        double result;
        result= number_1 + number_2;
        return result;
    }





    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        System.out.println("welcome dear user!");
        sc.nextLine();
        System.out.println("Would you like to:");
        System.out.println("a) sum again");
        System.out.println("b) exit");
        System.out.print("Option:");
        String option=sc.nextLine();

        switch(option){
            case "a":
                System.out.print("Please, insert the first number:");
                double x=sc.nextDouble();
                sc.nextLine();
                System.out.print("Please, insert the second number:");
                double y=sc.nextDouble();
                System.out.println("----");
                double z= sum(x,y);
                System.out.print("Thank you for your enquiry, the sum between"+x+"and"+y+"is"+z);
                break;
            case "b":
                System.out.print("Thank you! Have a good day.");
                break;


        }

    }
}

