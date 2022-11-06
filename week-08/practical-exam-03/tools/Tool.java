//==================================
// Foundations of Computer Science
// Student: Yang Quanyu
// id: 1874869
// Semester:2
// Year:2022
// Practical Exam Number:3
//===================================
public abstract class Tool implements Asset{
    float weight,value;

    public Tool(float weight,float value){
        this.weight=weight;                    //parameterized constructor
        this.value=value;
    } 



    public float getValue(){              //getter, for implementation
        return this.value;
    }

    public float getWeight(){              //getter
        return this.weight;
    }

    public abstract void useTool(int times);       //abstract method









}