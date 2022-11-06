//==================================
// Foundations of Computer Science
// Student: Yang Quanyu
// id: 1874869
// Semester:2
// Year:2022
// Practical Exam Number:3
//===================================

public class Hammer extends HandTool{
    public Hammer (float weight,float value){          //parameterized constructor
        super(weight, value, false);
        super.sharp=false;
    }


    public void useTool(int times){                //implementation
        System.out.println("Bang!");
        value=value-(float)0.01*times;
        if(value<0){
            value=(float)0.0;
        }

    }




}