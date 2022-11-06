//==================================
// Foundations of Computer Science
// Student: Yang Quanyu
// id: 1874869
// Semester:2
// Year:2022
// Practical Exam Number:3
//===================================

public class Chisel extends HandTool{
    public Chisel (float weight,float value){          //parameterized constructor
        super(weight, value,true);
        super.sharp=true;
    }


    public void useTool(int times){                //implementation
        System.out.println("Scrape");
        value=value-(float)0.02*times;
        if(value<0){
            value=(float)0.0;
        }

    }





}