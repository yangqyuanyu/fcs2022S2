class Book{
    String title,publish;
    int year,length;


    public Book(){
        this.title=title;
        this.publish=publish;
        this.year=year;
        this.length=length;
    }

    public void setTitle(String title){
        this.title=title;
    }
    public void setPublish(String publish){
        this.publish=publish;
    }
    public void setYear(int year){                                          //setter
        this.year=year;
    }
    public void setLength(int length){
        this.length=length;
    }



    public String getTitle(){
        return title;
    }
    public String getPublish(){                                 //getter
        return publish;
    }
    public int getYear(){
        return year;
    }
    public int getLength(){
        return length;
    }



    public static void main(String[] args){
        Book b=new Book();
        System.out.println("title: "+b.getTitle()+" publish: "+b.getPublish()+" year: "+b.getYear()+" length: "+b.getLength());

    }




}