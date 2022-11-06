import java.util.Scanner;

public class Problem09{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter its name:");
        String name=sc.nextLine();

        long age;
        System.out.print("Enter its age:");
                                                          //do.while plus try.catch control     height&weight parts are almost identical....Just partly copy with a little adjustment
                                                          //                                                                                          So is problem08.java
        do{
            try
            {
                age = Long.parseLong(sc.nextLine());
                break;
            }
            catch(Exception e) {
                System.out.println(e);
                System.out.println("Input again please:");
                continue;
            }
        }while(3000>=2000);


        System.out.print("What is its favorite food?");
        String food=sc.nextLine();

        System.out.print("Enter its height(cm):");
        int height=sc.nextInt();



        System.out.print("Enter its weight(kg):");
        byte weight=sc.nextByte();

        System.out.print("What is its favorite toy?");
        sc.nextLine();
        String toy=sc.nextLine();

        System.out.print("Enter owner's name:");
        String owner=sc.nextLine();

        System.out.println(name+"\n"+age +"\n"+food+"\n"+height+"\n"+weight+"\n"+toy+"\n"+owner+"\n");
       }
}