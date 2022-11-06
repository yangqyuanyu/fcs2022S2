/*==================================
Foundations of Computer Science
Student: Yang Quanyu
id: your a1874869
Semester:2
Year:2022
Practical Exam Number:5
===================================*/
import java.util.Stack;
public class Queue{
    public Node front, back;

    public void enqueue(Student tmpStudent){
        Node node = new Node(tmpStudent);
        if(this.back==null){
            this.back=node;
        }else{
        	node.setNext(this.back);
		    this.back = node;
        }
    }

    public Student dequeue(){
        Node tmpNode=this.back;
        if(tmpNode==null){
            return null;
        }
        if(tmpNode.getNext()==null){
            this.back=null;
            this.front=null;
            return tmpNode.getInfo();
        }

        while(tmpNode.getNext()!=null){
            this.front=tmpNode;
            tmpNode=tmpNode.getNext();
        }                                //at this step, front stay at the second node.


        Node tmp=this.front.getNext();

		this.front.setNext(null);
		if(tmp==null){
		    this.front=null;
		    this.back=null;
		    return null;
        }else{
            return tmp.getInfo();
        }
    }
    //Method peek
    public String peek(){
        Node tmpNode=this.back;
        if(tmpNode==null){
            return null;
        }
        while(tmpNode.getNext()!=null){
            this.front=tmpNode;
            tmpNode=tmpNode.getNext();
        }
        if(this.front.getNext()==null&&this.front!=null){
            return this.front.getInfo().getName();
        }
        Node tmp=this.front.getNext();
        Student temp=tmp.getInfo();
        return temp.getName();
    }
    //Method displayQueue
	public void displayQueue(){

        Node node=this.back;
        if(node==null){
            System.out.println("There are no students waiting for a scholarship ");
        }
        Stack<Student> stack=new Stack<>();

        while(node!=null){
            Student stu=node.getInfo();
            stack.add(stu);
            node=node.getNext();
        }
        int count=0;
        while(!stack.empty()){
            Student stackStudent=stack.pop();
            count++;
            stackStudent.printStu(count);
        }
	}



}
