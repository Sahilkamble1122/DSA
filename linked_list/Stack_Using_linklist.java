package linked_list;

import java.util.Scanner;

class Node1{
		int data;
		Node1 next;
		Node1(int data){
			this.data=data;
			this.next=null;
		}	
	}

class Stack_Linked_list_class{
		Node1 top;
		void Push(int data) {
			Node1 n = new Node1(data);
			if(top == null) {
				top=n;
			}
			else {
				n.next =top;
				top=n;
			}
			System.out.println( data +" inserted in top");
		}
		
		int pop() {
			 if (top == null) {
			        System.out.println("Stack Underflow");
			        return -1;  
			    }
			Node1 t = top;  // even this is not required just done for reporting
			top = top.next;
			System.out.println( t.data +" deleted");
			return t.data;
			}
	    int peek() {
	    	 if (top == null) {
	    	        System.out.println("Stack Underflow");
	    	        return -1; 
	    	    }
	    	Node1 t = top; 
	    	return t.data;
	    }
	    
	    void printStack() {
	        if (top == null)
	            System.out.println("stack Empty");
	        else {
	            Node1 t = top;
	            while (t != null) {
	                System.out.print("|" + t.data + "| -> ");
	                t = t.next;
	            }
	            System.out.println("NULL");
	        }
	    }
}

public class Stack_Using_linklist {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		Stack_Linked_list_class stack = new Stack_Linked_list_class();

        int t = 0;

        do {
            System.out.println("\n1. Push\n2. Pop\n3. Peek\n4. Print\n5. Exit");
            System.out.println("Enter operation:");
            t = sc.nextInt();

            switch (t) {
                case 1:
                    System.out.println("Enter element:");
                   
                    	int temp = sc.nextInt();
                        stack.Push(temp);
                    break;
                case 2:
                	
                    stack.pop();
                	
                    break;
                case 3:
                    System.out.println(stack.peek());
                    break;
                case 4:
                	stack.printStack();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }

        } while (t != 5);
        
    }
}


