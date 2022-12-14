public class Node {

    //Initializing protected variables.
    protected Node next;
    protected Patient patient;
    public Node(){
        this.next=null;
    }

    //Parametric constructor.
    public Node(Patient patient) {
        this.patient = patient;
        this.next = null;
    }

    //Defining accessor - getNext
    public Node getNext() {
        return next;
    }

    //Defining mutator - setNext
    public void setNext(Node next) {
        this.next = next;
    }

    //Defining accessor - getPatient
    public Patient getPatient() {
        return patient;
    }

    //Defining mutator - setPatient
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    //Method to print details.
    public void printNode(){
        System.out.println("patient id: " +patient.getId());
        System.out.println("Triage level: " +patient.getTriageLevel());
        System.out.println("Contact details: " +patient.getPhoneNumber());
        System.out.println("Name: " +patient.getName());
        System.out.println("Location: " +patient.getLocation());
    }
}