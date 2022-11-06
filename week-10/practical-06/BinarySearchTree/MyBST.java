public class MyBST {

	//Defining private variables.
	private Node base;

	//Default constructor.
	public MyBST() {
		this.base = null;
	}

	//Defining method insert for adding value..
	public void insert(int value) {
		insertRec(this.base,value);
	}

	//Defining private method insertRec for adding the value.
	private void insertRec(Node current, int value){

		if(this.base!=null) {              // Attention: Don't change base into current or else shit happens
			if( current.getInput() > value){
				if(current.getLeft()!= null){
					insertRec(current.getLeft(), value); //since 2nd recusion, the outside layer to check base is of no use
				}else{
					current.setLeft(new Node(value));
				}
			}else if(current.getInput() < value){
				if(current.getRight() != null) {
					insertRec(current.getRight(), value);
				}else{
					current.setRight(new Node(value));
				}
			}
		}else{
			this.base = new Node(value);
		}
	}
	//Returning booleans for search.
	public boolean search(int value) {
		return searchRec(this.base, value);
	}
	// Defining booleans searchRec.
	private boolean searchRec(Node current, int value) {
		try {                                                //try-catch
			if (current.getInput() == value) {
				return true;
			}
			else if (current.getInput() > value){
				return searchRec(current.getLeft(),value);
			}
			else if (current.getInput() < value) {
				return searchRec(current.getRight(),value);
			}
			else {
				return false;
			}
		} catch(Exception e){
			System.out.println("There are no elements in the data.");
			return false;
		}
	}
}
