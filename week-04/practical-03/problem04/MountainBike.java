class MountainBike extends Bicycle{                   //child class
    String forks,suspension ;
    public MountainBike(String suspension,String forks){
        this.suspension =suspension;                   //constuctor
        this.forks=forks;
        System.out.println("MountainBike constructor");
    }

}