class Rectangle{                       //base class
    double width,height;
    public Rectangle(){
    }
    public Rectangle(int width,int height){
        this.width=width;                //initializing
        this.height=height;
    }

    public void setWidth(int width){
        this.width=width;
    }                                      //setter
    public void setHeight(int height){
        this.height=height;
    }

    public double getWidth(){
        return width;
    }                                  //getter
    public double getHeight(){
        return height;
    }

    void display(double width,double height){
        System.out.println(width +" "+ height);
    }



}
