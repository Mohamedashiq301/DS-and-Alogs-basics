package ds.Queue;

public class Queue {

	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int nItems;
	
	
	public Queue(int size) {
		this.maxSize=size;
		this.queArray=new long[size];
		front = 0;
		rear = -1;
		nItems=0;
	}
	
	public void insert(long j) {
		
		if(rear==maxSize-1) {
			front=0;
		}
		
		rear++;
		if(front==maxSize) {
			front=0;
		}
		queArray[rear]=j;
		nItems++;
	}
	
	public long remove() {
		long temp=queArray[front];
		front++;
		nItems--;
		
		return temp;
	}
	
	public long peakFront() {
		return queArray[front];
	}
	
	public boolean isEmpty() {
		return (nItems==0);
	}
	
	public boolean isFull() {
		return (nItems==maxSize);
	}
	
	public void view() {
		System.out.print("[ ");
		for(int i=0;i<queArray.length;i++) {
			System.out.print(queArray[i]+" ");
		}
		System.out.print("]");
	}
}
