package deque;

/*
 * Deque stands for doubly ended queue
 * Linked List : Doubly linked list with front and rear reference 
 * Array: Circular array with front and rear indexes. We can also use front a size and can get rear using size
 * Linked list or using circular array time complexity should be O(1)
 * 
 * ********** APPLICATIONS *************
 * A deque can be used as both stact and queue
 * Maintaining history of actions
 * A steal process scheduling algorithm
 * Implementing a priority queue with two types of priorities
 * Maximum/Minimum of all subarrays of size k in an array
 * */

// InserFront and deleteFront they are O(n) operation

class Deque{
	int size, cap;
	int arr[];
	
	Deque(int c){
		arr = new int[c];
		size = 0;
		cap = c;
	}
	
	protected boolean isFull() {
		return size==cap;
	}
	
	protected boolean isEmpty() {
		return size == 0;
	}
	
	protected void insertRear(int x) {
		if(isFull()) return;
		
		arr[size] = x;
		size++;
	}
	
	protected void deleteRear() {
		if(isEmpty()) return;	
		size--;
	}
	
	protected int getRear() {
		if(isEmpty()) return -1;
		else return (size-1);
	}
	
	protected void insertFront(int x) {
		if(isFull()) return;
		for(int i = size-1; i>0; i--) {
			arr[i+1] = arr[i];
		}
		size++;
	}
	
	protected void deleteFront() {
		if(isEmpty()) return;
		for(int i=0; i<size-1;i++) {
			arr[i] = arr[i+1];
		}
		size--;
	}
	
	protected int getFront() {
		if(isEmpty()) return -1;
		else return 0;
	}
}

public class DequeArrayImpl {
	public static void main(String[] args) {
		
	}
}
