package ds.doublylinkedlist;

public class App {

	public static void main(String[] args) {
		DoublyLinkedList myList=new DoublyLinkedList();
		
		myList.insertFirst(100);
		myList.insertFirst(200);
		myList.insertFirst(300);
		myList.insertFirst(400);
		myList.insertFirst(500);
		myList.insertLast(600);
//		myList.insertLast(700);
//		myList.insertLast(800);
//		myList.insertLast(900);
//		myList.insertLast(1000);
		
		myList.displayForward();
		myList.displayBackward();
		
		
	}
}
