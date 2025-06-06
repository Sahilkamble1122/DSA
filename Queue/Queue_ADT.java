package queue;

import java.util.Scanner;

class Queue_Class {
    int front, rear,Maxsize, q[];

    Queue_Class(int size) {
    	Maxsize=size;
        rear = -1;
        front = 0;
        q = new int[size];
    }

    void enqueue(int e) {
        rear++;
        q[rear] = e;
        // or simply: q[++rear] = e;
    }

    boolean isFull() {
        return (rear == Maxsize - 1);
    }

    int dequeue() {
        int temp = q[front];
        front++;
        return temp;
        // or: return q[front++];
    }

    int peek() {
        return q[front];
    }

    boolean isEmpty() {
        return (front == rear+1);
    }

    void printQueue() {
        for (int i = front; i <= rear; i++) {
            System.out.println(q[i]);
        }
    }
}

public class Queue_ADT {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        System.out.println("Enter size of queue:");
	        int size = sc.nextInt();

	        Queue_Class queue = new Queue_Class(size);

	        int t = 0;

	        do {
	            System.out.println("\n1. enqueue\n2. dequeue\n3. Peek\n4. Print\n5. Exit");
	            System.out.println("Enter operation:");
	            t = sc.nextInt();

	            switch (t) {
	                case 1:
	                    System.out.println("Enter element:");
	                    if(queue.isFull()) {
	                    	System.out.println("queue is full");
	                    }
	                    else {
	                    	int temp = sc.nextInt();
	                    	queue.enqueue(temp);
						}
	                    break;
	                case 2:
	                	if (queue.isEmpty()) {
	                		System.out.println("Stack is empty");
	                	}else {
	                		queue.dequeue();
	                	}
	                    break;
	                case 3:
	                    System.out.println(queue.peek());
	                    break;
	                case 4:
	                	queue.printQueue();
	                    break;
	                case 5:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid option.");
	            }

	        } while (t != 5);

	        sc.close();

	}

}
