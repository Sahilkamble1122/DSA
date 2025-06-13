package DSA;

import java.util.Scanner;
import java.util.Stack;



public class rev {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.nextLine();
		Stack<Character> a = new Stack<>(); 
		for(int i=0 ; i< str.length() ; i++) {
			a.push(str.charAt(i));
		}
		String revString = "";
		while(!a.isEmpty()) {
			revString+=a.pop();
		}
		System.out.println(revString);
	}
}
