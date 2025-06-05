package DSA;
import java.util.Scanner;
import java.util.Stack;

class Max_Implimentation{

	static Stack<Integer> main_Stack= new Stack<>();
	static Stack<Integer> max_Stack= new Stack<>();
	
	
	static void push(int no) {
		if ((main_Stack.isEmpty() && max_Stack.isEmpty()) || (no > max_Stack.peek())) {
			main_Stack.push(no);
			max_Stack.push(no);
		}
		else {
			main_Stack.push(no);
		}	
	}
	
	static int pop() {
		
		if(!main_Stack.isEmpty()) {
		if(max_Stack.peek() == main_Stack.peek()) {
			max_Stack.pop();
			return (main_Stack.pop());
		}
		else {
			return (main_Stack.pop());
		}
		}
		return -1;
	}
	
	static int getMax() {
		return (max_Stack.peek());
	}
	static int peek() {
		if(!main_Stack.isEmpty()) {
			return (main_Stack.peek());
		}
		else {
			return -1;
		}
	}
}


public class MaxStack {

	public static void main(String[] args) {
		Max_Implimentation.push(10);
		Max_Implimentation.push(20);
		Max_Implimentation.push(12);
		Max_Implimentation.push(34);
		Max_Implimentation.push(7);
		
		
		System.out.println("peek :"+ Max_Implimentation.peek());
		System.out.println("pop :"+ Max_Implimentation.pop());
		System.out.println("max :"+ Max_Implimentation.getMax());
		System.out.println("pop :"+ Max_Implimentation.pop());
		System.out.println("peek :"+ Max_Implimentation.peek());
		System.out.println("peek :"+ Max_Implimentation.peek());
		System.out.println("max :"+ Max_Implimentation.getMax());
		

	}

}
