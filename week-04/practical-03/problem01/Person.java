class Person{
    String givenName,lastName,gender,citizenship;
    int age;
    public Person(){
        System.out.println("This is my first basic constructor");
    }

    public Person(String gN, String lN, int age, String gender,String cp){
        givenName=gN;
        lastName=lN;
        this.age=age;                                                            //parameterized constructor. Outside the constructor, we cannot find symbols like'gN','lN'somehow,even if there is public modifiers in front of it.
        this.gender=gender;
        citizenship=cp;
    }
    public void setGivenName(String givenName){
        givenName=givenName;
    }
    public void setlastName(String lastName){
        lastName=lastName;
    }
    public void setAge(int age){                                          //setter , in this case they become useless, proof is that when I remove 'this',the program still functions
        age=age;
    }
    public void setGender(String gender){
        gender=gender;
    }
    public void setCitizenship(String citizenship){
        citizenship=citizenship;
    }



    public String getGivenName(){
        return givenName;
    }
    public String getLastName(){                                 //getter
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public String getCitizenship(){
        return citizenship;
    }
    public String toString(){
        return ("Person's givenname is "+this.getGivenName()+" ,lastname is "+this.getLastName()+ ",age is "+this.getAge()+",gender is: "+this.getGender()+" and citizenship is "+this.getCitizenship());
    }



    public static void main(String[] args){
        new Person();
        Person p=new Person("Quanyu","Yang",23,"male","Chinese");
        System.out.println(p.toString());
    }




}
