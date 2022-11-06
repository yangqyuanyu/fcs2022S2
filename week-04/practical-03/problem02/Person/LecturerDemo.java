import java.util.*;

class Lecturer extends Person{
    public Lecturer(){
        super();                 //to invoke parent constructor of no-arg
        System.out.println("L's constructor is invoked");
    }

    void annualSalary(double salary){
        double annualsalary=salary*12;
        System.out.println("the annual salary: "+annualsalary);
    }
}

public class LecturerDemo{
    public static void main(String[] args){             //main function here
        Scanner sc=new Scanner(System.in);
        Lecturer l=new Lecturer();
        System.out.println("Input your salary: ");
        double slr=sc.nextDouble();
        l.annualSalary(slr);

    }
}