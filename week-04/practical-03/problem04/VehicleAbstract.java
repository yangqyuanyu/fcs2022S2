public abstract class VehicleAbstract implements Vehicle{
    String color;
    int year,numberGears;

    public VehicleAbstract(){
        System.out.println("no-arg constructor of VehicleAbstract is invoked");      //constructor
    }


    public void changeGear(double i){
        System.out.println("Sorry,your gear is unchangeable");       // implementing changeGear()
    }
    public void checkBrake(double i){
        System.out.println("your brake is broken, but we cannot fix it");           //implementing checkBrake()
    }



}