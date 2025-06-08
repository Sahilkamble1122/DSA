package linked_list;

import java.util.Scanner;

class Node2{
	int data;
	Node2 next;
	Node2(int data){
		this.data=data;
		this.next=null;
	}	
}

class Queue_Linked_list_class{
	Node2 front;
	Node2 rear;
	
	void enqueue(int data) {
		Node2 n = new Node2(data);
		if(front == null) {
			front=n;
			rear=n;	
		}
		else {
			Node2 t = front;
			rear.next=t;
			rear=t;
		}
		System.out.println( data +"inserted in right");
	}
	
	void dequeue() {
		if(front== null) {
			System.out.println("queue empty");
		}
		if(rear==front) {
			rear=front=null;
		}else {
		Node2 t = front;  
		front = front.next;
		System.out.println( t.data +"deleted in left");
		}
		
	}
	int peek() {
   	 if (front == null) {
   	        System.out.println("Queue empty");
   	        return -1; 
   	    }
   	Node2 t = front; 
   	return t.data;
   }
	
    void printQueue() {
        if (front == null)
            System.out.println("Queue Empty");
        else {
            Node2 t = front;
            while (t != null) {
                System.out.print("|" + t.data + "| -> ");
                t = t.next;
            }
            System.out.println("NULL");
        }
    }
}

public class Queue_using_linklist {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Queue_Linked_list_class queue = new Queue_Linked_list_class();

	        int t = 0;

	        do {
	            System.out.println("\n1. enqueue\n2. dequeue\n3. Peek\n4. Print\n5. Exit");
	            System.out.println("Enter operation:");
	            t = sc.nextInt();

	            switch (t) {
	                case 1:
	                    
	                    	int temp = sc.nextInt();
	                    	queue.enqueue(temp);
	                    break;
	                case 2:
	                	
	                		queue.dequeue();
	                	
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


