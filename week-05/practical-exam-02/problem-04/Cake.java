public class Cake{
    private String name;
    private float qtFlour,qtSugar,qtYeast;
    private double timePrepare;
    public Cake() {                                           //default constructor
    }
    public Cake(String name, float qtFlour, float qtSugar, float qtYeast, double timePrepare) {
        this.name = name;
        this.qtFlour = qtFlour;
        this.qtSugar = qtSugar;                                  //parameterized constructor
        this.qtYeast = qtYeast;
        this.timePrepare = timePrepare;
    }
    public String getName() {                               // setters and getters
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getQtFlour() {
        return qtFlour;
    }
    public void setQtFlour(float qtFlour) {
        this.qtFlour = qtFlour;
    }
    public float getQtSugar() {
        return qtSugar;
    }
    public void setQtSugar(float qtSugar) {
        this.qtSugar = qtSugar;
    }
    public float getQtYeast() {
        return qtYeast;
    }
    public void setQtYeast(float qtYeast) {
        this.qtYeast = qtYeast;
    }
    public double getTimePrepare() {
        return timePrepare;
    }
    public void setTimePrepare(double timePrepare) {
        this.timePrepare = timePrepare;
    }

    public double getTimePrepare(double timePrepare) {
        return timePrepare ;
    }




}