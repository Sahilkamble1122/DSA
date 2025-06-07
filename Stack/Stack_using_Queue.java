package Array;

import java.util.LinkedList;
import java.util.Queue;

class stackQ{
	
	Queue<Integer> s = new LinkedList<>();
	
	void push(int k) {
		
		s.add(k);
		
		for(int i = 0; i < s.size()-1; i ++) {
			s.add(s.remove());
		}
	}
	int pop() {
		if(!s.isEmpty())
		 return s.remove();
		else {
			System.out.println("stack empty");
		return -1 ;
		}
	}
	
	int peek() {
		return s.peek();
	}
	boolean isEmpty() {
		return s.isEmpty();
	}
	
	void printStack() {
            System.out.println(s);
        }
    }
	


public class Stack_using_Queue {

	public static void main(String[] args) {
	    stackQ q = new stackQ();
	    q.push(12);
	    q.push(2);
	    q.push(5);
	    q.push(7);
	    System.out.println("peek :" +q.pop());
	    System.out.println("peek :" +q.pop());
	    
	    q.printStack();
	}

}
