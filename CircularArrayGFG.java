package deque;

class Deeque{
	static final int MAX = 100;
	int arr[];
	int front, rear, size;
	
	public Deeque(int size) {
		arr = new int[MAX];
		front = -1;
		rear = 0;
		this.size = size;
	}
	/*// Operation on Deque
	 * void insertFront(int key);
	 * void insertRear(int key);
	 * void deleteFront();
	 * void deleteRear();
	 * boolean isFull();
	 * boolean isEmpty();
	 * int getFront();
	 * int getRear();
	 * */
	
	// Checks whether Deque is full or not 
	boolean isFull() {
		return ((front == 0 && rear == size - 1) || front == rear + 1);
	}
	
	// Checks whether Deque is empty or not
	boolean isEmpty() {
		return front == -1;
	}
	
	// Inserts an element at front
	void insertFront(int key) {
		if(isFull()) {
			System.out.println("Overflow");
			return;
		}
		
		// if  queue is initially empty
		if(front == -1) {
			front = 0;
			rear = 0;
		}else if(front == 0) {  // front is at first position of queue
			front = size - 1;
		}else { // decrement front end by '1'
			// as we are entering front from end like currently we are on 4th position
			// now to enter a new front we have to enter at position 3 then we have to have to perform decrement
			front = front - 1;
		}

		// insert current element into Deque
		arr[front] = key;
		
	}
	
	// function to insert element at rear end of Deque
	void insertRear(int key) {
		if(isFull()) {
			System.out.println("Overflow");
			return;
		}
		
		// if queue is initially empty
		if(front == -1) {
			front = 0;
			rear = 0;
		}else if(rear == size - 1){ // rear is at last position of queue
			rear = 0;
		}else { // increment rear end by 1 
			rear = rear + 1;
		}
		
		// insert current element into Deque
		arr[rear] = key;
	}
	
	// Delete element at front end of Deque
	void deleteFront() {
		// check whether Deque is empty or not
		if(isEmpty()) {
			System.out.println("Queue Underflow");
			return;
		}
		
		// Deque has only one element
		if(front == rear) {
			front = -1;
			rear = -1;
		}else { // back to initial position
			if(front == size - 1) {
				front = 0;
			}else { // increment front by '1' to remove current front value from Deque
				front = front + 1;
			}
		}
	}
	
	// Delete element at rear end of Deque
    void deleteRear()
    {
        if (isEmpty()) {
            System.out.println(" Underflow");
            return;
        }
 
        // Deque has only one element
        if (front == rear) {
            front = -1;
            rear = -1;
        }
        else if (rear == 0)
            rear = size - 1;
        else
            rear = rear - 1;
    }
    
    // Returns front element of Deque
    int getFront()
    {
        // check whether Deque is empty or not
        if (isEmpty()) {
            System.out.println(" Underflow");
            return -1;
        }
        return arr[front];
    }
    
    // function return rear element of Deque
    int getRear()
    {
        // check whether Deque is empty or not
        if (isEmpty() || rear < 0) {
            System.out.println(" Underflow\n");
            return -1;
        }
        return arr[rear];
    }
    
}


public class CircularArrayGFG {

	public static void main(String[] args) {
		 Deeque dq = new Deeque(5);
		 
         // Function calls
       System.out.println(
           "Insert element at rear end  : 5 ");
       dq.insertRear(5);

       System.out.println(
           "insert element at rear end : 10 ");
       dq.insertRear(10);

       System.out.println("get rear element : "
                          + dq.getRear());

       dq.deleteRear();
       System.out.println(
           "After delete rear element new rear become : "
           + dq.getRear());

       System.out.println(
           "inserting element at front end");
       dq.insertFront(15);

       System.out.println("get front element: "
                          + dq.getFront());

       dq.deleteFront();

       System.out.println(
           "After delete front element new front become : "
           + +dq.getFront());

	}

}
