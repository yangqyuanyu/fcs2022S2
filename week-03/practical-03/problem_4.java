import java.util.*;

public class ComplexCalculator{

    static String add(double a,double b,double c,double d){  //create a function named'add'
        String result="";
        double x,y;
        x=a+c;
        y=b+d;
        result=x+"+"+y+"i";
        return result;
    }

    static String sub(double a,double b,double c,double d){     //create a function named'sub'
        String result="";
        double x,y;
        x=a-c;
        y=b-d;
        result=x+"+"+y+"i";
        return result;
    }

    static String multiplication(double a,double b,double c,double d){   //create a function named'multiplication'
        String result="";
        double x,y;
        x=a*c-b*d;
        y=b*c+a*d;
        result=x+"+"+y+"i";
        return result;
    }

    static String division(double a,double b,double c,double d){     //create a function named'division'
        String result="";
        double x,y;
        x=(a*c+b*d)/(c*c+d*d);
        y=(b*c-a*d)/(c*c+d*d);
        result=x+"+"+y+"i";
        return result;
    }



    public static void main(String[] args){          //Here is our main body
        double a,b,c,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("1,Input the real and imaginary numbers respectively");
        a=sc.nextDouble();
        b=sc.nextDouble();
        System.out.println("So the first complex number is"+a+"+"+b+"i");
        System.out.println("2,Input the real and imaginary numbers respectively");
        c=sc.nextDouble();
        d=sc.nextDouble();


        System.out.println("So the second complex number is"+c+"+"+d+"i");
        sc.nextLine();
        System.out.println("Addition: "+add(a,b,c,d));                   //Call the functions above
        System.out.println("Subtraction: "+sub(a,b,c,d));
        System.out.println("Multiplication: "+multiplication(a,b,c,d));
        if(c==0&&d==0){
            System.out.print("0 cannot serve as divisor");
            System.exit(0);
        }
        System.out.println("Division:"+division(a,b,c,d));


    }

}
