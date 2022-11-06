import java.util.*;

class Doctor extends Person{
    public Doctor(String speciality){
        super();                                     //trying to invoke the constructor Person()
        setSpeciality(speciality);                   //directly call setter without creating a reference
        System.out.println("parameterized constructor of Doctor is invoked");
    }
}

public class DoctorDemo{
    public static void main(String[] args){
        Doctor d=new Doctor("kanqingzi");
        System.out.println(d.getSpeciality());
    }
}
