public class MyStack extends Node{
    private Node top; // The reference to the top node in this stack
    MyStack(){
        System.out.println("Empty stack is created");
        this.top=null;
    }

//To push a Node on top of the Stack, first we must create a new node Node node【 = new Node(data)】
//Then this new node will become the top. This node will then point to the old top value(node.next = top) and then the top points to the node (top = node).
    public void push(Node node){
        	node.setNext(this.top);
        	this.top = node;
    }

    public Node pop(){
        if (this.top == null){
	    System.out.println("Stack is empty");
	    return null;
	}else{
	    Node temp=this.top;
	    this.top = this.top.getNext();
	    return temp;
	}
    }

    public Node peek(){
	if(this.top==null){
	    System.out.println("Stack is empty");
	    return null;
	}else{
            return top;
	}
    }


    public boolean isEmpty(){
	return (this.top==null);
    }
}
