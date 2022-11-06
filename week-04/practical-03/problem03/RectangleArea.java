class RectangleArea extends Rectangle{
    public RectangleArea(){
    }

    void read_input(){
        System.out.println("Input width and height in order: ");
    }


    void display(double width,double height){      //override
        System.out.println(width*height);
    }

    void printMsg(){
        super.display(width,height);          //call the overriden method
        display(width,height);                //call the overriding method
                                              //the expected output will be 0,cuz I never use setter and getter
    }

}