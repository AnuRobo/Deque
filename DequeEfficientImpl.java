package deque;

class DequeE{
	int arr[];
	//this is circular array implementation and front is not always going to be zero.
	// Front can be anywhere
	// we are not having a variable for the rear because we are using (front + size - 1)%cap
	int front, cap, size;
	public DequeE(int c) {
		arr = new int[c];
		cap = c;
		size = 0;
		front = 0;
	}
	
	boolean isEmpty() {
		return size == 0;
	}
	
	boolean isFull() {
		return size == cap;
	}
	
	void deleteFront() {
		if(isEmpty()) return;
		front = (front + 1)%cap;
		size--;
	}
	
	void insertRear(int x) {
		if(isFull()) return;
		int new_rear = (front + size)%cap;
		arr[new_rear] = x;
		size++;
	}
	
	int getFront() {
		if(isEmpty()) return -1;
		else return front;
	}
	
	void insertFront(int x) {
		if(isFull()) return;
		front = (front + cap - 1)%cap;
		arr[front] = x;
		size++;
	}
	
	void deleteRear() {
		if(isEmpty())return;
		size--;
	}
	
	int getRear() {
		if(isEmpty()) return -1;
		else return (front+size-1)%cap;
	}
}

public class DequeEfficientImpl {

	public static void main(String[] args) {
		
	}

}
