import java.util.*;
import java.io.*;
public class Student{
    protected int physic,chemistry,math;
    protected String name;
    protected double average;
    protected String stuString=" ";
    double weight;



    public Student(){
    }
    public Student(String stuString){
        this.stuString=stuString;
    }
    public Student(String name, int physic, int chemistry, int math){       //constructor
        this.name=name;
        this.physic=physic;
        this.chemistry=chemistry;
        this.math=math;
        this.average=averageMark(physic, chemistry, math);
        this.weight=100000*average+100*physic+chemistry+0.01*math;
    }
    double averageMark(int a,int b,int c){
        return (double)(a+b+c)/3;
    }



    public void setName(String name){                                    //setters
        this.name=name;
    }
    public void setPhysic(int physic){
        this.physic=physic;
    }
    public void setChemistry(int chemistry){
        this.chemistry=chemistry;
    }
    public void setMath(int math){
        this.math=math;
    }
    public void setAverage(double average){
        this.average=average;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public String getName(){                                         //getters
        return name;
    }
    public int getPhysic(){
        return physic;
    }
    public int getChemistry(){
        return chemistry;
    }
    public int getMath(){
        return math;
    }
    public double getAverage(){
        return average;
    }
    public double getWeight(){
        return weight;
    }








    private static void swap(Student[] students, int low, int high) {
        Student temp = students[low];
        students[low] = students[high];
        students[high] = temp;
    }


    public Student[] sortStudents(Student[] students){
        //First, sort according to their weight.Then, name

        for(int i=0;i<students.length-1;i++){
            for(int j=0;j<students.length-1-i;j++){
                if (students[j].getWeight() < students[j + 1].getWeight()) {
                    swap(students, j, j + 1);
                }else if(students[j].getWeight()==students[j + 1].getWeight()){
                    int compareName = students[j].getName().compareTo(students[j + 1].getName());
                    if (compareName > 0) {
                        swap(students, j, j + 1);
                    }
                }
            }
        }



        return students;
    }

}