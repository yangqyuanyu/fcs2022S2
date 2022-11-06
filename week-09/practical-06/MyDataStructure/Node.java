public class Node{

    private String data; // the data saved in this node
    private Node next; // the reference to another N!O!D!E!



	// Basic constructor
	public Node(){
		// this.data=data;
		// this.next=null;
	}


	// Parameterized constructor
	public Node(String data) {
		this.data = data;
		this.next = null;
	}

	public void setData(String data){       //setter
	    this.data=data;
	}
	public String getData(){                //getter
	    return data;
	}


	public void setNext(Node newNode){
	    this.next = newNode;
	}

	public Node getNext(){
		return this.next;
	}

	public void printNode(){
		System.out.println(getData());
		// System.out.println(getNext());
	}

    // public static void main(String[] args){

    // 	Node n1 = new Node("A");
    // 	Node n2 = new Node("B");
    // 	Node n3 = new Node("C");
    // 	n1.next = n2;
    // 	n2.next = n3;

    // 	n1.printNode(); //n1.next
    // 	System.out.println(n2);
    // 	System.out.print(n1);

    // }


}
