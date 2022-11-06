//==================================
// Foundations of Computer Science
// Student: Yang Quanyu
// id: 1874869
// Semester:2
// Year:2022
// Practical Exam Number:3
//===================================
public abstract class HandTool extends Tool{
    boolean sharp;

    public HandTool(float weight,float value,boolean sharp){
        super(weight,value);                                        //parameterized constructor
        this.sharp=sharp;
    }

    public boolean isSharp(){
        return this.sharp;
    }

    
}