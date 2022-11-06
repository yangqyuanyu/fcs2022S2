import java.io.*;
import java.util.*;




public class Main extends Student{
    private static Student[] readData(String filename)throws Exception{                           //read data in the file
        Student students[]=new Student[20];
        File file = new File("/users/9/a1874869/Desktop/fcs/week-07/practical-05/MarksOfClass/students.txt");
        Scanner sc = new Scanner(file);
        for(int i=0;i<20;i++){
            Student stu=new Student(sc.nextLine());         //store the data in String format
            students[i]=stu;
        }

        return students;
    }






    public static void printStudents(Student[] students){
        System.out.println("\n----------------------------------------------------------------\n");
        System.out.println("Student       AverageScore    Physic        Chemistry         Maths");

        for(int i=0;i<20;i++){
            System.out.println(students[i].getName()+"\t\t"+Math.round(students[i].getAverage())+"\t\t"+students[i].getPhysic()+"\t\t"+students[i].getChemistry()+"\t\t"+students[i].getMath()+"\t\t\t\t"+students[i].weight);
        }
    }







    //main method
    public static void main(String[] args) throws Exception{
        Student s=new Student();
        Student students[]=readData("Hyomin.png");
        System.out.println("The addresses are as follows: "+"\n"+Arrays.toString(students));
        File file = new File("/users/9/a1874869/Desktop/fcs/week-07/practical-05/MarksOfClass/students.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }




        Student[] arr={                                              //create objects referring to the address in which the ideal data are stored
            new Student("John",95,75,88),
            new Student("Alice",88,95,75),
            new Student("Johnson",95,75,88),
            new Student("Dennis",60,100,100),
            new Student("Jack",77,84,93),
            new Student("Tod",84,86,80),
            new Student("Tom",68,70,75),
            new Student("Dave",90,90,92),
            new Student("David",99,70,87),
            new Student("Trent",89,77,90),
            new Student("Bob",100,67,89),
            new Student("Fiona",77,89,90),
            new Student("Peter",80,88,82),
            new Student("Amy",85,95,78),
            new Student("Nancy",83,93,82),
            new Student("Richard",81,91,86),
            new Student("Daniel",77,78,79),
            new Student("James",80,90,85),
            new Student("Cathy",95,74,89),
            new Student("Paul",84,87,79)};

        Student[] sortedStudents=s.sortStudents(arr);
        printStudents(sortedStudents);





    }
















}