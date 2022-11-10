class MyQueue{
    private Node front; // points to the first element in queue
    private Node rear; //  points at last element in queue

    public MyQueue(){
	this.rear=null;
	this.front=null;
    }


    public void setFront(Node node){
        this.front=node;
    }

    public void setRear(Node node){
        this.rear=node;
    }

    // Getter
    public Node getFront(){
        return this.front;
    }

    public Node getRear(){
        return this.rear;
    }

    // link element to the rear
    public void enqueue(Node node){
	if(this.rear==null){
	    this.rear=node;
	    this.front=node;
	}else{
            node.setNext(rear);
            rear=node;
	}
    }


	// get rid of element from the front
    public String dequeue(){
        Node tmpNode=this.rear;
        if(tmpNode==null){
            return null;
        }

        while(tmpNode.getNext()!=null){
            this.front=tmpNode;
            tmpNode=tmpNode.getNext();
        }                                //at this step, front stay at the second node.


        Node tmp=this.front.getNext();

	this.front.setNext(null);
	if(tmp==null){
	    this.front=null;
	    this.rear=null;
	    return null;
        }else{
            return tmp.getData();
        }
    }

    public boolean isEmpty(){
	return rear==null&&front==null;
    }


    public void displayQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        Node temp=front;      //temp pointer
        while(temp!=null){
            temp.printNode();
            temp=temp.getNext();
        }
    }

    public Node peek(){
	if (this.front==null||rear==null){
	    System.out.println("Queue is empty");
	    return null;
	}else{
	    return front;
	}
    }

}
