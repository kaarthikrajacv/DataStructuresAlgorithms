package tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	
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
	
	
	public static void LevelOrderTraversalPrint(Node root) {
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty()) {
			Node tempNode = q.poll();
			System.out.println(tempNode.key);
			
			if(tempNode.left !=null) {
				q.add(tempNode.left);
			}
			if(tempNode.right!=null) {
				q.add(tempNode.right);
			}
			
		}
		
	}

}
