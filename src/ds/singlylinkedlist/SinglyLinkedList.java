package ds.singlylinkedlist;

public class SinglyLinkedList {

	private Node first;
	
	public SinglyLinkedList() {
		
	}
	
	public boolean isEmpty() {
		return (first==null);
	}
	
	//used to insert at the begining of the list
	
	public void insertFirst(int data) {
		Node newNode=new Node();
		newNode.data=data;
		newNode.next=first;
		first=newNode;
	}
	
	public Node deleteFirst() {
		Node temp=first;
		first=first.next;
		return temp;
	}
	
	public void displayItem() {
		System.out.println("List (fist-->last) ");
		
		Node current=first;
		while(current!=null) {
			current.display();
			current= current.next;
		}
		System.out.println();
	}
	
	public void insertLast(int data) {
		Node current = first;
		while(current.next!=null) {
			 current=current.next;
		}
		Node newNode=new Node();
		newNode.data=data;
		current.next=newNode;
	}
}
