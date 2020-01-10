package tree;

public class BoundaryOfATree {
	
public Node root;
	
	public static class Node 
    { 
        int key; 
       public  Node left; 
        public Node right; 
          
        // Constructor 
        public Node(int data) 
        { 
            key = data; 
            left = null; 
            right = null; 
        } 
    }
	
	public static void findTreeBoundary(Node root) {
		
		printLeft(root);
		printleaves(root);
		//printleaves(root.right);
		System.out.println("#");
		printRight(root);
		
	}

	public static void printRight(Node root) {
		if(root==null)
			return;
	
		if(root.right !=null) {
			printRight(root.right);
			System.out.println(root.key);
		}else if(root.left !=null) {
			printRight(root.left);
			System.out.println(root.key);}
		
	}

	public static void printleaves(Node node) {
		
		if(node==null) 
		{
			return;
		}
		printleaves(node.left);
		if(node.left ==null && node.right == null) {
			System.out.println(node.key);
			return;
		}
		printleaves(node.right);
		
	}

	public static void printLeft(Node root) {
		
		if(root==null)
			return;
	
		if(root.left !=null) {
			System.out.println(root.key);
			printLeft(root.left);}
		else if(root.right != null) {
			System.out.println(root.key);
			printLeft(root.right);}
	} 
	
	

}
