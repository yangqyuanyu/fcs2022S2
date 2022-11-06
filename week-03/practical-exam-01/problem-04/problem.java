import java.util.*;

public class problem{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter width and height to draw a rectangular shape");
        double width=sc.nextDouble();
        double height=sc.nextDouble();
        if(width==0||height==0){
            System.out.print("Drawing is over");
        }else if(width==height){
            System.out.println("Drawing a square of size"+width);
            for(int i=1;i<=width;i++){
                for(int j=1;j<=width;j++){
                    System.out.print("#");
                }
                System.out.println();
            }
        }else{
            System.out.println("Drawing a rectangular of size"+width+"by"+height);
            for(int i=1;i<=width;i++){
                for(int j=1;j<=height;j++){
                    System.out.print("#");
                }
                System.out.println();
            }
        }
    }
}