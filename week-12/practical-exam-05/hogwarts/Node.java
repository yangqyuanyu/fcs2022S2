/*==================================
Foundations of Computer Science
Student: Yang Quanyu
id: your a1874869
Semester:2
Year:2022
Practical Exam Number:5
===================================*/

public class Node {
	private Node next;
	private Student info;

	//Default constructor
	Node() {
		this.next = null;
	}

	//parameterized constructor
	Node(Student tmpStudent) {
		this.next = null;
		this.info = tmpStudent;
	}

	//getter
	public Node getNext() {
		return this.next;
	}
	public Student getInfo() {
		return this.info;
	}

	//setter
	public void setInfo(Student info) {
		this.info = info;
	}
	public void setNext(Node next) {
		this.next = next;
	}

}
