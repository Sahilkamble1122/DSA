
package queue;

import java.util.Scanner;

class CircularQueue_Class {
    int front, rear,Maxsize, q[];
    int count =0;

    CircularQueue_Class(int size) {
    	Maxsize=size;
        rear = -1;
        front = 0;
        q = new int[size];
    }

    void enqueue(int e) {
    	rear = (rear +1)%Maxsize;
    	q[rear]=e;
       count++;
    }

    boolean isFull() {
    	
        return (count == Maxsize);
    }

    int dequeue() {
        int temp = q[front];
        front =(front +1)%Maxsize;
        count--;
        return temp;
    }

    int peek() {
        return q[front];
    }

    boolean isEmpty() {
        return (count == 0);
    }

    void printQueue() {
        for (int i = front , c =0; c < count; i=(i +1)%Maxsize) {
            System.out.println(q[i]);
            c++;
        }
    }
}

public class CircularQueue {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        System.out.println("Enter size of queue:");
	        int size = sc.nextInt();

	        CircularQueue_Class queue = new CircularQueue_Class(size);

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
