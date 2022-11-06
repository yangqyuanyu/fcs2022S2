import java.util.*;

class Patient extends Person{

    public Patient(){
        super();                      //trying to invoke the constructor Person()
        System.out.println("parameterized constructor of Patient is invoked");
    }
}






public class PatientDemo{
    public static void main(String[] args){
        Patient p=new Patient();
        System.out.println("the 3 properties from parent class are : "+p.getDiagnostic()+" , "+p.getInTime()+" and "+p.getPrevTime());

    }
}
