import java.util.Scanner;

public class Problem08{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter your name:");
        String name=sc.nextLine();
        
        System.out.print("How old are u?");
        long age=sc.nextLong();
        
        System.out.print("What is your favorite food?");
        String food=sc.nextLine();
        
        sc.nextLine();
        System.out.print("Enter your grade in Maths");
        String gradeM=sc.nextLine();
        
        System.out.print("Enter your grade in English");
        String gradeE=sc.nextLine();
        
        System.out.print("Enter your height(cm)");
        int height=sc.nextInt();
        
        System.out.print("Enter your weight(kg)");
        byte weight=sc.nextByte();
        
        System.out.print("Enter the number of subject");
        byte number=sc.nextByte();
        
        System.out.println(name+"\n"+age +"\n"+food+"\n"+gradeM+"\n"+gradeE+"\n"+height+"\n"+weight+"\n"+number+"\n");
    }
}
    
    
    
    
    
    
    
    
    