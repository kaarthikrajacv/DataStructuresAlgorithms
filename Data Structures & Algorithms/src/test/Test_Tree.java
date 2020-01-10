package test;

import tree.BoundaryOfATree.Node;

public class Test_Tree {
	
	public static void main(String[] args) {
		
		Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 
        root.right.left.right = new Node(8); 
        root.right.right.right = new Node(9); 
        System.out.println("Diameter is"); 
        tree.BoundaryOfATree.findTreeBoundary(root);
		
	}

}
