package tree;
import java.util.Scanner;

class node{
	int data;
	node left;
	node right;
	
	node(int k){
		this.data=k;
		left=null;
		right=null;
	}
}

class Tree_class{
	
	node root;
	
	
	void insert(node r,node n) 
	{
		if (root == null) {
			root=n;
		}else 
		{
			if(n.data < r.data)
			{
				if(r.left == null) 
				{
					r.left = n;
				}else {
					insert(r.left, n);
				}
			}
			else
			{
				if(r.right == null) 
				{
					r.right = n;
				}else {
					insert(r.right, n);
				}
			}
		}
	}
	void inorder(node r)
    {
		if(r!=null) {
			inorder(r.left);
			System.out.print(r.data+ " , ");
			inorder(r.right);
		}
	}
	
	void preOrder(node r) {
		if(r!=null) {
			System.out.print(r.data+ " , ");
			inorder(r.left);
			inorder(r.right);
		}
	}
	void PostOrder(node r) {
		if(r!=null) {
			inorder(r.left);
			inorder(r.right);
			System.out.print(r.data+ " , ");
		}
	}
	int countNodes(node root) {
		if(root == null) {
			return 0;
		}
		else 
			return 1+ countNodes(root.left)+countNodes(root.right);
	}
	
	int count_leaf(node r) {
		
		if(r == null) {
			return 0 ;
		}
		else if(r.left==null && r.right==null)
			return 1;
		else {
		return count_leaf(r.left)+count_leaf(r.right);
		}
	}
	int depth(node r) {
		if (r == null) {
			return 0;
		}
		return 1 + Math.max(depth(r.left), depth(r.right));
	}
	
	boolean search(node r , int key) {

	if (r == null) {
		return false;
	}
	else {
		if (key == r.data) {
			return true;
		}
		else {
			if(key < r.data) {
				return search(r.left, key);
			}else {
				return search(r.right, key);
			}
		}
	}
	}
	
	int findSum(node r) {
		if(r == null) {
			return 0 ;
		}
		else
			return r.data+ findSum(r.left)+ findSum(r.right);
	}
}
public class Tree_ADT {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Tree_class tree = new Tree_class();
	        int choice;

	        do {
	            System.out.println("\n--- Binary Tree Menu ---");
	            System.out.println("1. Insert a node");
	            System.out.println("2. Inorder Traversal");
	            System.out.println("3. Preorder Traversal");
	            System.out.println("4. Postorder Traversal");
	            System.out.println("5. Count Nodes");
	            System.out.println("6. Count Leaf Nodes");
	            System.out.println("7. Tree Depth");
	            System.out.println("8. Search for a node");
	            System.out.println("9. Sum of all nodes");
	            System.out.println("0. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter value to insert: ");
	                    int val = sc.nextInt();
	                    tree.insert(tree.root, new node(val));
	                    break;

	                case 2:
	                    System.out.print("Inorder Traversal: ");
	                    tree.inorder(tree.root);
	                    System.out.println();
	                    break;

	                case 3:
	                    System.out.print("Preorder Traversal: ");
	                    tree.preOrder(tree.root);
	                    System.out.println();
	                    break;

	                case 4:
	                    System.out.print("Postorder Traversal: ");
	                    tree.PostOrder(tree.root);
	                    System.out.println();
	                    break;

	                case 5:
	                    System.out.println("Total nodes: " + tree.countNodes(tree.root));
	                    break;

	                case 6:
	                    System.out.println("Leaf nodes: " + tree.count_leaf(tree.root));
	                    break;

	                case 7:
	                    System.out.println("Tree depth: " + tree.depth(tree.root));
	                    break;

	                case 8:
	                    System.out.print("Enter value to search: ");
	                    int key = sc.nextInt();
	                    boolean found = tree.search(tree.root, key);
	                    if (found) {
	                        System.out.println("Node found!");
	                    } else {
	                        System.out.println("Node not found.");
	                    }
	                    break;

	                case 9:
	                    System.out.println("Sum of all nodes: " + tree.findSum(tree.root));
	                    break;

	                case 0:
	                    System.out.println("Exiting program.");
	                    break;

	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }
	        } while (choice != 0);

	        sc.close();
	    }
	}
