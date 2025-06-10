package tree;


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
		if(r == null) {
			return 0 ;
		}
		else if(r.left==null && r.right==null)
			return 1;
		else 
			return 1+Math.max(depth(r.left), depth(r.right));
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
		Tree_class a = new Tree_class();
		a.insert(a.root, new node(20));
		a.insert(a.root, new node(30));
		a.insert(a.root, new node(10));
		a.insert(a.root, new node(50));
		a.insert(a.root, new node(40));
		
		a.inorder(a.root);
		System.out.print("\n----------------------\n");
		a.preOrder(a.root);
		System.out.print("\n----------------------\n");
		a.PostOrder(a.root);
		
		
		System.out.println("total nodes :"+ a.countNodes(a.root));
		
		
		System.out.println("leaf :" + a.count_leaf(a.root));
		
		System.out.println("depth :"+(a.depth(a.root)-1));
		
		
		System.out.println(a.search(a.root, 23));
		
		
		System.out.println(a.findSum(a.root));

	}

}
