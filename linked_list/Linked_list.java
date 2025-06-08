package linked_list;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}	
}

class Linked_list_class{
	Node root;
	
	void insertleft(int data) {
		Node n = new Node(data);
		if(root == null) {
			root=n;
		}
		else {
			n.next =root;
			root=n;
		}
		System.out.println( data +"inserted in left");
	}
	void insertRight(int data) {
		Node n = new Node(data);
		if(root == null) {
			root=n;
		}
		else {
			Node t = root;
			while(t.next!= null) {
				t=t.next;
			}
			t.next=n;
		}
		System.out.println( data +"inserted in right");
	}
	void deleteLeft() {
		Node t = root;  // even this is not required just done for reporting
		root = root.next;
		System.out.println( t.data +"deleted in left");
	}
	
	void deleteRight() {
		if (root.next == null) {
	        System.out.println(root.data + " deleted in right");
	        root = null;
	        return;
	    }
		Node t =root;
		while(t.next.next!= null)
		{
			t=t.next;
		}
		System.out.println(t.next.data +"deleted in right" );
		t.next=null;
	}
	boolean search(int key) {
		if (root == null) {
			System.out.println("List empty");
		}
		else {
			Node t=root; 
			while(t!=null) {
				if(t.data==key)
					return true;
				else {
					t=t.next;
				}
			}
		}
		return false;
	}
	void deleteElement(int key) {
		Node t = root; 
		if (root == null) {
			System.out.println("List empty");
		}
		else 
		{
			while(t!=null)
			{
				if(t.data==key)
					break;
				else {
					t=t.next;
				}
			}
		}
		if(t==null) 
		{
			System.out.println("element not found");
		}
		else
		{
			if(t==root)
			{
				root=root.next;
			}
			else if(t.next== null) 
			{
				t.next=null;
			}
			else {
				t.next=t.next.next;
			}
		}
	}
	void insertIn(int i,int key) {
		Node t = root; 
		if (root == null) {
			System.out.println("List empty");
		}
		else 
		{
			while(t!=null)
			{
				if(t.data==i)
					break;
				else {
					t=t.next;
				}
			}
		}
		if(t==null) 
		{
			System.out.println("element not found");
		}
		else {
			Node n = new Node(key); 
			n.next=t.next;
			t.next=n;
			System.out.println(n.data + " Inserted");
		}
	}
	
	void sort() {
		if (root == null) {
			System.out.println("List empty");
		}
		else 
		{
		for(Node i=root ; i.next != null ; i= i.next ) {
			for(Node j=i.next ; j!= null ; j= j.next) {
				if(j.data<i.data) {
					int temp= i.data;
					i.data = j.data;
					j.data = temp;
				}
			}
		
		}
		System.out.println("sorted");
	  }
	}
	
	void printList() {
        if (root == null)
            System.out.println("List Empty");
        else {
            Node t = root;
            while (t != null) {
                System.out.print("|" + t.data + "| -> ");
                t = t.next;
            }
            System.out.println("NULL");
        }
    }
}


public class Linked_list {

	public static void main(String[] args) {
		   Linked_list_class list = new Linked_list_class();

	        list.insertleft(10);
	        list.insertRight(20);
	        list.insertleft(5);
	        list.insertRight(30);
	        
	        list.insertleft(43);
	        list.insertRight(21);
	        list.insertleft(64);
	        list.insertRight(23);
	        

	        System.out.println("\nSearching for 20: " + (list.search(20) ? "Found" : "Not Found"));
	        System.out.println("Searching for 100: " + (list.search(100) ? "Found" : "Not Found"));

	        list.deleteLeft();
	        list.deleteRight();

	        list.deleteElement(20);
	        list.deleteElement(100);
	        
	        list.sort();
	        
	        list.printList();
	        
	}

}
