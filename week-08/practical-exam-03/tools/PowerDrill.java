//==================================
// Foundations of Computer Science
// Student: Yang Quanyu
// id: 1874869
// Semester:2
// Year:2022
// Practical Exam Number:3
//===================================

public class PowerDrill extends PowerTool{
    public PowerDrill (float weight,float value){          //parameterized constructor
        super(weight, value,800);
        super.power=800;
    }


    public void useTool(int times){                //implementation
        System.out.println("Zssh!");
        value=value-(float)0.03*times;
        if(value<0){
            value=(float)0.0;
        }

    }




}