public class Car{
    private String model;
    private float literTank;
    private int numGears,yearManufacture,mileage;




    public Car(){
        System.out.println("constructor of no-arg");     //no-arg constructor
    }

    public Car(String model,float literTank, int numGears,int yearManufacture,int mileage){
        this.model=model;
        this.literTank=literTank;
        this.numGears=numGears;                         //parameterized constructor
        this.yearManufacture=yearManufacture;
        this.mileage=mileage;
    }

    public void setModel(){
        this.model=model;
    }
    public void setLiterTank(){
        this.literTank=literTank;
    }
    public void setNumGears(){                                          //setter
        this.numGears=numGears;
    }
    public void setYearManufacture(){
        this.yearManufacture=yearManufacture;
    }
    public void setMileage(){
        this.mileage=mileage;
    }

    public String getModel(){
        return model;
    }
    public float getLiterTank(){
        return literTank;
    }
    public int getNumGears(){                                          //getter
        return numGears;
    }
    public int getYearManufacture(){
        return yearManufacture;
    }
    public int getMileage(){
        return mileage;
    }



}