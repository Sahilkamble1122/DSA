package linked_list;

import java.util.Scanner;

class Double_node{
	int data;
	Double_node next;
	Double_node pre;
	
	Double_node(int k){
		this.data=k;
		next=null;
		pre=null;
	}
}
class Doubly_linked_list_class{
	Double_node root;
	
	void insertLeft(int k) {
		Double_node d = new Double_node(k) ;
		if(root == null) {
			root=d;
		}
		else {
			root.pre=d;
			d.next=root;
			root=d;
		}
	}
	void insertRight(int k) {
		Double_node d = new Double_node(k) ;
		if(root == null) {
			root=d;
		}
		else {
			Double_node t=root;
			while(t.next!=null) {
				t=t.next;
			}
			t.next=d;
			d.pre=t;
		}
	}
	void deleteLeft() {
		if(root==null) {
			System.out.println("list empty");
		}
		else {
			root=root.next;
			root.pre = null;
		}
	}
	void deleteRight() {
		if(root==null) {
			System.out.println("list empty");
		}
		else {
			Double_node t=root;
			while(t.next.next!=null) {
				t=t.next;
			}
			t.next=null;
		}
	}
	
	void printQueueleft() {
		if(root==null) {
			System.out.println("list empty");
		}
		Double_node t=root;
		while(t!=null) {
			System.out.println(t.data+" ");
			t=t.next;
		}
	}
	void printQueueRight() {
		if(root==null) {
			System.out.println("list empty");
		}
		Double_node t=root;
		while(t.next!=null) {
			t=t.next;
		}
		while(t!=null) {
		System.out.println(t.data+" ");
		t=t.pre;
		}
	}
}



public class Doubly_linked_list {

	public static void main(String[] args) {
		Doubly_linked_list_class Q = new Doubly_linked_list_class();
		
		Scanner sc = new Scanner(System.in);
		int t=0;
		while(t!=7) {
			System.out.println("1.insert left , 2.insert right , 3.delete left , 4.delete right, 5.print from left , 6. print from right , 7.EXIT!!");
			t=sc.nextInt();
			switch(t) {
			case 1 :
				System.out.println("enter no");
				int temp= sc.nextInt();
				Q.insertLeft(temp);
				break;
			case 2 :
				System.out.println("enter no");
				int temp2= sc.nextInt();
				Q.insertRight(temp2);
				break;
			case 3 :
				Q.deleteLeft();
				break;
			case 4:
				Q.deleteRight();
				break;
			case 5:
				Q.printQueueleft();
				break;
			case 6: 
				Q.printQueueRight();
				break;
			case 7 :
				System.out.println("exiting...");
				break;
			default:
				System.out.println("chose correct option");
			}
		}
		
		
		
	}

}
