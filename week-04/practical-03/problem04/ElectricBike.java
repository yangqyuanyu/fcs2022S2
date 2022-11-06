class ElectricBike extends Bicycle{              //child class
    String battery;
    public ElectricBike(String battery){
        this.battery=battery;                           //constructor
        System.out.println("ElectricBike constructor");
    }

    void chargeBike(){
        System.out.println("Good news: ne charge for charging bikes with electricity !");
    }

}