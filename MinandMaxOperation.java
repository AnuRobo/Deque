package deque;

import java.util.Arrays;

class Deqque{
	int arr[];
	int front, cap, size, prevFront;
	
	Deqque(int x){
		arr = new int[x];
		cap = x;
		front = 0;
		size = 0;
		prevFront = 0;
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
	
	void insertMin(int x) {
		if(isFull()) return;
		if(prevFront==0) {
			front = (front + cap - 1)%cap;
			arr[front] = x;
		}
		if(prevFront>x) {
			front = (front + cap - 1)%cap;
			arr[front] = x;
		}
		
		prevFront = arr[front];
		size++;
	}
	
	void insertMax(int x) {
		if(isFull())return;
		int newRear = (front + size)%cap;
		arr[newRear] = x;
		size++;
	}
	
	int getFront() {
		if(isEmpty()) return -1;
		else return front;
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

public class MinandMaxOperation {

	public static void main(String[] args) {
		Deqque d = new Deqque(6);
		d.insertMax(30);
		d.insertMin(20);
		d.insertMin(19);
		d.insertMin(21);
		d.insertMin(18);
//		d.insertMax(40);
		
		System.out.println(Arrays.toString(d.arr));
		System.out.println(d.getFront());
		System.out.println(d.getRear());
	}

}
