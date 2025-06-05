
package DSA;
import java.util.Scanner;
import java.util.Stack;



public class decimal_binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Decimal");
		int no=sc.nextInt();
		Stack<Integer> a = new Stack<>(); 
		int nw=0;
		while(no!=0) {
			a.push(no%2);
			no=no/2;
		}
		while (!a.isEmpty()) {
			nw=nw*10+a.pop();
	   }
		System.out.println(nw);
	}
}
