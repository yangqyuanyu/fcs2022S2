class Shape{
    double width,height,radius,length;
    public Shape(){
        this.width=width;
        this.height=height;                                //no-arg constructor
        this.radius=radius;
        this.length=length;
    }

    public void setWidth(double width){
        this.width=width;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public void setRadius(double radius){                                          //setter
        this.radius=radius;
    }
    public void setLength(double length){
        this.length=length;
    }



    public double getWidth(){
        return width;
    }
    public double getHeight(){                                 //getter
        return height;
    }
    public double getRadius(){
        return radius;
    }
    public double getLength(){
        return length;
    }



    public static void main(String[] args){
        Shape s=new Shape();
        System.out.println("width: "+s.getWidth()+" height: "+s.getHeight()+" radius: "+s.getRadius()+" Length: "+s.getLength());

    }




}
