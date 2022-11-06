interface Vehicle{
    String motto="I love Kan Qingzi";   // initialization is necessary. Just leaving a declaration here triggers error
    public void changeGear(double x);   //these two are gonna be implemented by VehicleAbstract class
    public void checkBrake(double x);
}
