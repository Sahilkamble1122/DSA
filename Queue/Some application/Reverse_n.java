package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
class Queue_reverse {

	  static Queue<Integer> reverse(Queue<Integer> q, int k){
	        
	        Stack<Integer> stack = new Stack<>();
	        
	        for (int i = 0; i < k; i++) {
	            stack.push(q.remove());
	        }

	        while (!stack.isEmpty()) {
	            q.add(stack.pop());
	        }
	        
	        int size = q.size();
	        for (int i = 0; i < size - k; i++) {
	            q.add(q.remove());
	        }
	        return q;
	    }
}
public class Reverse_n{
	    
	    public static void main(String[] args) {
	        
			Queue<Integer> queue = new LinkedList<>();
			queue.add(1);
			queue.add(2);
			queue.add(3);
			queue.add(4);
			queue.add(5);
			Stack<Integer> stack = new Stack<>();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter no want to reverse");
			int k = sc.nextInt();
			System.out.println("Queue: " + queue);
			if(k<0 && queue.size()<=k) 
			{
				Queue<Integer> queue2=  Queue_reverse.reverse(queue, k);
				System.out.println("new Queue "+queue2);
			}
			else 
				System.out.println("enter smaller no");
	    }
	}
