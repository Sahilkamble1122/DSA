// print in binary given n numbers 

package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class n_Binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		Queue<String> liSt = new LinkedList<>(); 
		liSt.add("1");
		for(int i= 0 ; i<n ;i++ ) {
			
			System.out.println(liSt.peek());
			String temp=liSt.remove();
			liSt.add(temp + "0");
			liSt.add(temp + "1");
		}
		sc.close();
	}

}
