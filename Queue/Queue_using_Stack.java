package Array;
import java.util.Stack;

class QueueS{
	
	    Stack<Integer> q = new Stack<>(); 
    
	    void enqueue(int e) {
	       q.push(e);
	    }

	    int dequeue() {
	        if(q.isEmpty()) 
	        {
	        	System.out.println("queue empty");
	        }
	        int x = q.pop();
	        if(q.isEmpty()) 
	        {
	        	return x;
	        }
	        else 
	        {
	        	int result= dequeue();
	        	q.push(x);
	        	return result;
	        }
	        	
	    }

	    int peek() {
	    	if(q.isEmpty()) 
	        {
	        	System.out.println("queue empty");
	        }
	        int x = q.pop();
	        if(q.isEmpty()) 
	        {
	        	q.push(x);
	        	return x;
	        }
	        else 
	        {
	        	int result= dequeue();
	        	q.push(x);
	        	return result;
	        }
	        
	    }

	    boolean isEmpty() {
	        return q.isEmpty();
	    }
	
}

public class Queue_using_Stack {

	public static void main(String[] args) {
		
		QueueS s = new QueueS();
		s.enqueue(4);
		s.enqueue(5);
		s.enqueue(7);
		s.enqueue(2);
		s.enqueue(8);
		
		System.out.println(s.dequeue());
		System.out.println(s.dequeue());
	
		System.out.println(s.peek());
		
	}

}
