import java.util.LinkedList;
import java.util.Collections;
class Club{
    LinkedList<Swimmer> members=new LinkedList<Swimmer>();
    //default constructor
    public Club(){
    }

    //parameterized constructor
    public Club(LinkedList<Swimmer> members){
        this.members=members;
    }

    void addMember(Swimmer member){
        members.add(member);
        for(int i=0;i<members.size()-1;i++){
            for(int j=0;j<members.size()-1-i;j++){
                if(members.get(j).getName().compareTo(members.get(j+1).getName())>0){
                    Collections.swap(members,j,j+1);
                }
            }
        }
    }

    Boolean removeMemberById(int id){
        for(int i=0;i<members.size();i++){
            if(members.get(i).getId()==id){
                members.remove(i);
                return true;
            }
        }
        return false;
    }

    public Swimmer getHighestRankedSwimmer(){
        if(members.peekFirst()==null){
            return null;
        }

        Swimmer highest=members.get(0);
        for(int i=1;i<members.size();i++){
            if(members.get(i).getRanking()>highest.getRanking()){
                highest=members.get(i);
            }else if(members.get(i).getRanking()==highest.getRanking()){
                if(members.get(i).getAge()<highest.getAge()){
                    highest=members.get(i);
                }
            }
        }

        return highest;
    }

    void printMembers(){
        for(int i=0;i<members.size();i++){
            System.out.println(members.get(i).toString());
        }
    }

    public void countMembers(){
        int count_1=0;
        int count_2=0;
        for(int i=0;i<members.size();i++){
            if(members.get(i).getAge()<21){
                count_1++;
            }else{
                count_2++;
            }
        }
        System.out.println("The club has "+count_1+" junior and "+count_2+" senior members");
    }


    public int countJunior(){
        int count_1=0;
        for(int i=0;i<members.size();i++){
            if(members.get(i).getAge()<21){
                count_1++;
            }
        }
        return count_1;
    }


    public Swimmer getHighestRankedJunior(){
        if(members.peekFirst()==null||countJunior()==0){
            return null;
        }
        Swimmer highest=members.get(0);

        for(int i=0;i<members.size();i++){
            if(members.get(i).getAge()<21){
                highest=members.get(i);
                break;
            }
        }

        for(int i=0;i<members.size();i++){
            if(members.get(i).getRanking()>highest.getRanking()&&members.get(i).getAge()<21){
                highest=members.get(i);
            }else if(members.get(i).getRanking()==highest.getRanking()&&members.get(i).getAge()<21){
                if(members.get(i).getAge()<highest.getAge()&&members.get(i).getAge()<21){
                    highest=members.get(i);
                }
            }
        }
        return highest;
    }
}
