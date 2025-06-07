package DSA;

import java.util.Stack;

public class correct_parantheses {

	public static void main(String[] args) {
		Stack<String> op = new Stack<>();
		Stack<String> no = new Stack<>();
		
		String ex = "1+2)*3-4)*5-6)))";
		
		for (char ch : ex.toCharArray()) {
	            String c = String.valueOf(ch);
			if( c.equals("+") || c.equals("-")|| c.equals("*")|| c.equals("/")) {
				op.push(c);
			}
			else if(c.equals(")")) {
				String a1= no.pop();
				String b1= op.pop();
				String a2= no.pop();
				
				String s1= "(" + " "+ a2 + " " + b1 + " " + a1 + " " + ")";
				
				no.push(s1);
			}
			else {
				no.push(c);
			}
			
			System.out.println(no.peek());
		}
		
		
	}

}
