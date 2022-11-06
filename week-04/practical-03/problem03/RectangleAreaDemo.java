import java.util.*;
public class RectangleAreaDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double width,height;
        RectangleArea ra=new RectangleArea();
        Rectangle r=new Rectangle();
        ra.read_input();


        do{
            try
            {
                width = Double.parseDouble(sc.nextLine());
                height = Double.parseDouble(sc.nextLine());
                break;                                         //try-catch exception
            }
            catch(Exception e) {
                System.out.println(e);
                System.out.println("Input again please:");
            }
        }while(true);







        while(width>1000||height>1000||width<1||height<1){
        System.out.println("Input width and height in order AGAIN : ");
        width=sc.nextDouble();
        height=sc.nextDouble();
        }

        r.display(width,height);
        // System.out.println(width+" "+height);
        ra.display(width,height);
    }

}
