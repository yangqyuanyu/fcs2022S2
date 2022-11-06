public class Node {
    private int index;
    private Node next;

    //Default constructor.
    public Node() {
        this.index = 0;
        this.next = null;
    }

    //Parametric constructor.
    public Node(int index) {
        this.index = index;
        this.next = null;
    }

    //Displaying message.
    public void printNode() {
        System.out.print("Node " + this.index);
    }

    //Defining accessors.
    public int getIndex() {
        return index;
    }

    //Defining mutators.
    public void setIndex(int index) {
        this.index = index;
    }
    //no setter or getter for 'next'
}