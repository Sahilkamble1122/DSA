package linked_list;

class node{
	int data;
	node next;
	node(int data){
		this.data=data;
		this.next=null;
	}	
}

class Circular_list_class{
	node root;
	node last;
	
	void insertleft(int data) {
		node n = new node(data);
		if(root == null) {
			root=n;
			last=n;
			last.next=root;  //
		}
		else {
			n.next =root;
			root=n;
			last.next=root;//
		}
		System.out.println( data +"inserted in left");
	}
	void insertRight(int data) {
		node n = new node(data);
		if(root == null) {
			root=n;
			last=n;
			last.next=root; 
		}
		else {
			node t = root;
			last.next=t;
			last=t;
			last.next=root;
		}
		System.out.println( data +"inserted in right");
	}
	void deleteLeft() {
		if(root== null) {
			System.out.println("queue empty");
		}
		if(last==root) {
			root=last=null;
		}else {
			node t = root;  
		root = root.next;
		last.next=root;
		System.out.println( t.data +"deleted in left");
		}
		
	}
	
	void deleteRight() {
		if (root== last) {
	        System.out.println(root.data + " deleted in right");
	        root = null;
	        return;
	    }
		node t =root;
		while(t.next.next!= root)
		{
			t=t.next;
		}
		t.next=root;
		last=t;
	}
	
	void printList() {
        if (root == last)
            System.out.println("List Empty");
        else {
        	node t = root;
            do {
                System.out.print("|" + t.data + "| -> ");
                t = t.next;
            }while (t != root);
            System.out.println("NULL");
        }
    }
}

public class Circular_list {

	public static void main(String[] args) {
		

	}

}
