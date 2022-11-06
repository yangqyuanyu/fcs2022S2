import java.util.*;
class Student extends Person{
    public Student(){
        System.out.println("default constructor invoked");        //basic constructor
    }

    public Student(double[] array1,String[] array2){
        super();
        System.out.println("parameterized constructor is invoked");     // parameterized constructor of Student
    }

    public static void averageMarks(double[] array,int num){
        double sum=0;
        for(double element:array){                              //averageMarks methods created by myself
            sum+=element;
        }
        double average=sum/num;
        System.out.println(average);
    }

}




public class StudentDemo{
    public static void main(String[] args){
        Student s=new Student();
        Scanner sc=new Scanner(System.in);
        System.out.println("how many disciplines are there?");
        int num=sc.nextInt();
        System.out.println("what are they?");
        String[] disciplines=new String[num];
        sc.nextLine();                                          //put the single 'nextLine'outside the for loop
        for(int i=0;i<disciplines.length;i++){
            disciplines [i]=sc.nextLine();
        }
        s.setDisciplines(disciplines);

        System.out.println("Input their marks in order: ");
        double[] marks=new double[num];
        for(int i=0;i<disciplines.length;i++){
            marks[i]=sc.nextDouble();
            sc.nextLine();
            s.setMarks(marks);
        }

        Student ss=new Student(marks,disciplines);
        s.averageMarks(s.getMarks(),num);
        s.displayDisciplines(s.getDisciplines());
    }
}