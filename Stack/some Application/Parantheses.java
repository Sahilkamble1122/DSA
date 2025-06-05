package DSA;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;


class check{
	public static boolean isWell(String str) {
		Stack<Character> a = new Stack<>();
		for(char c : str.toCharArray()) {
			if (c == '{') {
				a.push(c);
			}
			if(c == '}') {
				if(!a.isEmpty()) {
					a.pop();
				}
				else 
					return false;  // in between case
			}
		}
		return a.isEmpty();   // if empty true else false
	}
}



public class Parantheses {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter code");
		String str=sc.nextLine();
	    boolean is = check.isWell(str);
	    System.out.println(is);
	}

}
