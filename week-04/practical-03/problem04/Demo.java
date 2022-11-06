import java.util.*;
import java.io.*;
import java.util.regex.*;
import java.text.*;
public class Demo{
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to Bicycle Repair Store");
        sc.nextLine();
        ElectricBike ebike=new ElectricBike("kanqingzi");            //will invoke the constructors of abstract and parent class respectively
        ebike.chargeBike();
        sc.nextLine();
        MountainBike mbike=new MountainBike("kanqingzi","hyomin");
        sc.nextLine();
        RoadBike rbike=new RoadBike("kanqingzi");
        sc.nextLine();
        Hibrid hbike=new Hibrid("kanqingzi");
        sc.nextLine();
        VehicleAbstract va=new Bicycle();
        sc.nextLine();
        System.out.println("Let's check your brake. Input the scale(double) of your brake");
        double j=sc.nextDouble();
        rbike.checkoutService();
        va.checkBrake(j);

        System.out.println("Was your bike serviced at our store before? yes/no?");
        sc.nextLine();
        String content=rd.readLine();                                               // regex, for bonus; I/O Stream,for bonus
        String pattern=".*yes.*";
        ebike.is_serviced = Pattern.matches(pattern, content);
        System.out.println("The answer is " + ebike.is_serviced);


        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
        hbike.outDate=ft.format(dNow);
        System.out.println("outDate is "+hbike.outDate);                                 //just the current time,for bonus
    }
}