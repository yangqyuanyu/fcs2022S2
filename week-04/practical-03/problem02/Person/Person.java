import java.util.*;

public class Person{                //parent class
    private double[] marks;
    private String[] disciplines;
    private double salary;
    private String diagnostic,inTime,prevTime;
    private String speciality;

    public Person(double[] marks,String[] disciplines,double salary,String speciality,String diagnostic,String inTime,String prevTime){
        this.marks=marks;
        this.disciplines=disciplines;
        this.salary=salary;
        this.speciality=speciality;
        this.diagnostic=diagnostic;
        this.inTime=inTime;
        this.prevTime=prevTime;
    }
    public Person(){
        System.out.println("no-arg constructor in Parent class");
    }


    public void setMarks(double[] marks){
        this.marks=marks;
    }
    public void setDisciplines(String[] disciplines){
        this.disciplines=disciplines;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }                                           //setters
    public void setSpeciality(String speciality){
        this.speciality=speciality;
    }
    public void setDiagnostic(String diagnostic){
        this.diagnostic=diagnostic;
    }
    public void setInTime(String inTime){
        this.inTime=inTime;
    }
    public void setPrevTime(String prevTime){
        this.prevTime=prevTime;
    }


    public double[] getMarks(){
        return marks;
    }
    public String[] getDisciplines(){
        return disciplines;
    }
    public double getSalary(){
        return salary;                  //getters
    }
    public String getSpeciality(){
        return speciality;
    }
    public String getDiagnostic(){
        return diagnostic;
    }
    public String getInTime(){
        return inTime;
    }
    public String getPrevTime(){
        return prevTime;
    }


    void displayDisciplines(String[] array){
        System.out.println(Arrays.toString(array));

    }

}


