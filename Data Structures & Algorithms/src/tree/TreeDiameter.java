package tree;



public class TreeDiameter {
	
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
	
	static int a = Integer.MIN_VALUE;

	/* Function to find height of a tree */
	public static int height(Node root) 
	{ 
		if (root == null) 
			return 0; 

		int left_height = height(root.left); 

		int right_height = height(root.right); 

		// update the answer, because diameter of a 
		// tree is nothing but maximum value of 
		// (left_height + right_height + 1) for each node 
		//a = Math.max(a, 1 + left_height + 
						//right_height); 

		return 1 + Math.max(left_height, right_height); 
	} 

	/* Computes the diameter of binary 
	tree with given root. */
	public static int diameter(Node root) 
	{ 
		if (root == null) 
			return 0; 

	
		return height(root.left)+height(root.right)+1; 
		//return a; 
	}

}
