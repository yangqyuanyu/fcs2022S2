public class Patient {

    //Instatiating private variables.
    private static int totalPatient;
    // The unique id for the patient
    private int id;
    // can be 1-5, from not urgent to resuscitation
    private int triageLevel;
    private String phoneNumber;
    private String name;
    private String location;

    //Parametric constructor.
    public Patient(String name, String phoneNumber, int triageLevel, String location) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.triageLevel = triageLevel;
        this.location = location;
        this.totalPatient ++;
        this.id = this.totalPatient;
    }

    //getter
    public String getName() {
        return name;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    //getter
    public String getPhoneNumber() {
        return phoneNumber;
    }

    //setter
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //getter
    public int getTriageLevel() {
        return triageLevel;
    }

    //setter
    public void setTriageLevel(int triageLevel) {
        this.triageLevel = triageLevel;
    }

    //getter
    public String getLocation() {
        return location;
    }

    //setter
    public void setLocation(String location) {
        this.location = location;
    }

    //getter
    public int getId() {
        return this.id;
    }
}
