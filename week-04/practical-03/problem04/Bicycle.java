class Bicycle extends VehicleAbstract{
    protected boolean is_serviced;
    String inDate,outDate,serviceResponsible;

    public Bicycle(){
        System.out.println("no-arg constructor of Bicycle is invoked");      //no-arg constructor
    }


    void checkoutService(){
        System.out.println("Checking out......");
    }

}