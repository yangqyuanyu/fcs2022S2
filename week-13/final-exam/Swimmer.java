class Swimmer extends Person{
    private int numWins,numCompeted,Id;
    static int id;

    //constructor
    public Swimmer(String name,int age,int numWins,int numCompeted){
        super(name,age);
        this.numWins=numWins;
        this.numCompeted=numCompeted;
        this.id++;
        this.Id=this.id;
    }

    //method win and lose
    void win(){
        this.numWins++;
        this.numCompeted++;
    }
    void lose(){
        this.numCompeted++;
    }

    public int getRanking(){
        if(numCompeted==0){
            return 0;
        }else{
            return numCompeted*(numWins/numCompeted);
        }
    }

    public int getId(){
        return this.Id;
    }
    //override
    public String toString(){
        return "Person: "+getName()+" is age: "+getAge()+" Id: "+getId()+" Ranking: "+getRanking();
    }

    // public String toStringSwimmer(){
    //     return "Swimmer: "+getName()+" is age: "+getAge()+" Id: "+getId()+" Ranking: "+getRanking();
    // }
}