//==================================
// Foundations of Computer Science
// Student: Yang Quanyu
// id: 1874869
// Semester:2
// Year:2022
// Practical Exam Number:3
//===================================
public abstract class PowerTool extends Tool{
    int power;

    public PowerTool(float weight,float value,int power){
        super(weight,value);                                        //parameterized constructor
        this.power=power;
    }

    public int getPower(){                                       //getter
        return this.power;
    }



    
}
