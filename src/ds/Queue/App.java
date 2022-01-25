package ds.Queue;

public class App {

	public static void main(String[] args) {

		Queue myqueue=new Queue(5);
		
		myqueue.insert(10);
		myqueue.insert(20);
		myqueue.insert(30);
		myqueue.insert(40);
		myqueue.insert(50);
		myqueue.insert(60);
		myqueue.view();
	}

}
