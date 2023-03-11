/*==================================
Foundations of Computer Science
Student: Yang Quanyu
id: your a1874869
Semester:2
Year:2022
Practical Exam Number:5
===================================*/

class Student{
    private String name;
    private int age,period;
    //Default constructor
    Student() {
	this.name = "unknown";
	this.age = 0;
	this.period = 0;
    }

    //Parametric constructor
    Student(String tmpName, int tmpAge, int tmpPeriod){
	this.name = tmpName;
	this.age = tmpAge;
	this.period = tmpPeriod;
    }

    //getter
    public String getName(){
	return this.name;
    }
    public int getAge(){
	return this.age;
    }
    public int getPeriod(){
	return this.period;
    }

    //setter
    public void setName(String tmpName){
	this.name = tmpName;
    }
    public void setAge(int tmpAge){
	this.age = tmpAge;
    }
    public void setPeriod(int tmpPeriod){
	this.period = tmpPeriod;
    }

    //method printStudent
    void printStudent(){
        System.out.println("Printing student record");
        System.out.println("Name:   "+getName());
        System.out.println("Age:    "+getAge());
        System.out.println("Period: "+getPeriod());
    }

    //method printStu
    /**
     * @param c
     */
    public void printStu(int c){
        switch(getPeriod()){
            case 1:
                System.out.println("#"+c+" "+getName()+", "+getAge()+" years old, "+getPeriod()+"st year in Hogwarts;");
                break;
            case 2:
                System.out.println("#"+c+" "+getName()+", "+getAge()+" years old, "+getPeriod()+"nd year in Hogwarts;");
                break;
            case 3:
                System.out.println("#"+c+" "+getName()+", "+getAge()+" years old, "+getPeriod()+"rd year in Hogwarts;");
                break;
            default:
                System.out.println("#"+c+" "+getName()+", "+getAge()+" years old, "+getPeriod()+"th year in Hogwarts;");
        }
    }
}
