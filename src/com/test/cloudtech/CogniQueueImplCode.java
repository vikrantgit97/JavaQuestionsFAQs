package com.test.cloudtech;

class Queue {

	private int[] arr;
	private int front;
	private int rear;
	private int capacity;
	private int count;

	public Queue(int size) {
		arr = new int[size];
		capacity = size;
		front = 0;
		rear = -1;
		count = 0;
	}

	public void enqueue(int item) { // method to add element in queue
		if (isFull()) {
			System.out.println("overflow ");
			System.exit(-1);
		}
		System.out.println("inserting " + item);

		rear = (rear + 1) % capacity;
		arr[rear] = item;
		count++;
	}

	public int dequeue() { // method to remove element in queue
		if (isEmpty()) {
			System.out.println("underflow");
			System.exit(-1);
		}
		int x = arr[front];
		System.out.println("removing " + x);
		front = (front + 1) % capacity;
		count--;
		return x;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("underflow");
			System.exit(-1);
		}
		return arr[front];
	}

	public boolean isEmpty() {
		return count == 0;
	}

	public boolean isFull() {
		return count == capacity;
	}

	public int size() {
		return count;
	}
}

public class CogniQueueImplCode {

	public static void main(String[] args) {
		Queue queue = new Queue(4);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		// queue.enqueue(4);

		System.out.println("size of queue " + queue.size());
		System.out.println("element at front " + queue.peek());

		queue.dequeue();
		queue.dequeue();

	}
}
