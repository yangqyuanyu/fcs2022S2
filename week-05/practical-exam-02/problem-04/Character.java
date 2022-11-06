public class Character{
    private String name;
    private int age;
    private String gender;
    private String occupation;
    private String familyRole;
    private float rate;







    public Character() {
    }                                            //default constructor
    public Character(String name, int age, String gender, String occupation, String familyRole, float rate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;                              //parameterized constructor
        this.familyRole = familyRole;
        this.rate = rate;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {           //setter
        this.gender = gender;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    public void setFamilyRole(String familyRole) {
        this.familyRole = familyRole;
    }
    public void setRate(float rate) {
        this.rate = rate;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public String getOccupation() {           //getter
        return occupation;
    }
    public String getFamilyRole() {
        return familyRole;
    }
    public float getRate() {
        return rate;
    }




}