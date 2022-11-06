import java.util.*;
public class DetCalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Welcome to Matrix Determinant Calculator!"+"\n"+"Would you like to calculate the determinant of a new matrix?"+"\n"+"1. Yes, 2. No"+"\n"+"Option:");
        int option=sc.nextInt();
        String dimension = "";
        switch(option){
            case 1:
                System.out.print("What is the dimension of the matrix?"+"\n"+"Input:");
                dimension=sc.next();                         //If you use nextLine() method, it will jump out of the program
                break;
            case 2:
                System.out.println("See you ~~~~");
                System.exit(0);
        }
       System.out.print(dimension);                         //dimension is a string
       switch(dimension){
            case "2*2":
                double A,B,C,D;
                sc.nextLine();
                System.out.println("Great! Let's calculate this determinant then."+"\n"+"Please insert all the values for your matrix.");
                sc.nextLine();
                System.out.print("New matrix [0][0]");
                A=sc.nextDouble();
                System.out.print("New matrix [0][1]");
                B=sc.nextDouble();
                System.out.print("New matrix [1][0]");
                C=sc.nextDouble();
                System.out.print("New matrix [1][1]");
                D=sc.nextDouble();
                double twoD[][]={{A,B},{C,D}};
                for(int i=0;i<twoD.length;i++){
                    for(int j=0;j< twoD[i].length;j++){                    //for nests in for
                        System.out.print(twoD[i][j]+" ");
                    }
                    System.out.println();
                }
                System.out.print("Determinant:"+(A*D-B*C));
                break;
            case "3*3":
                double a,b,c,d,e,f,g,h,i;
                System.out.println("Great! Let's calculate this determinant then."+"\n"+"Please insert all the values for your matrix.");
                sc.nextLine();
                System.out.print("New matrix [0][0]");
                a=sc.nextDouble();
                System.out.print("New matrix [0][1]");
                b=sc.nextDouble();
                System.out.print("New matrix [0][2]");
                c=sc.nextDouble();
                System.out.print("New matrix [1][0]");
                d=sc.nextDouble();
                System.out.print("New matrix [1][1]");
                e=sc.nextDouble();
                System.out.print("New matrix [1][2]");
                f=sc.nextDouble();
                System.out.print("New matrix [2][0]");
                g=sc.nextDouble();
                System.out.print("New matrix [2][1]");
                h=sc.nextDouble();
                System.out.print("New matrix [2][2]");
                i=sc.nextDouble();                                         //insert the 9 numbers accordingly
                double threeD[][]={{a,b,c},{d,e,f},{g,h,i}};
                for(int k=0;k<threeD.length;k++){
                    for(int j=0;j<threeD[k].length;j++){                    //for nests in for
                        System.out.print(threeD[k][j]+" ");
                    }
                    System.out.println();
                }
                System.out.print("Determinant:"+(a*e*i+b*f*g+c*d*h-c*e*g-b*d*i-a*f*h));
                break;
                default:
                    System.out.println("? No can do! See you~~~");
        }
    }
}

