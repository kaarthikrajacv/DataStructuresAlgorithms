package tree;

import java.util.TreeMap;
import java.util.Vector;
import java.util.Map.Entry;


public class DiagonalTraversalBinaryTree {
	
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
	
	public static void getDiagonalOrder(Node root, int hd, TreeMap<Integer, Vector<Integer>> m) {
		
		if(root==null) {
			return;
		}
		
		Vector<Integer> get = m.get(hd);
		
		if(get==null) {
			get = new Vector<>();
			get.add(root.key);
		}
		else {
			get.add(root.key);
		}
		
		m.put(hd, get);
		
		getDiagonalOrder(root.left, hd-1, m);
		getDiagonalOrder(root.right, hd, m);
		
	}
	
	public static void printDiagonalOrder(Node root) {
		TreeMap<Integer,Vector<Integer>> m = new TreeMap<>(); 
        int hd =0; 
        getDiagonalOrder(root,hd,m); 
         
        for (Entry<Integer, Vector<Integer>> entry : m.entrySet()) 
        { 
            System.out.println(entry.getValue()); 
        }
	}

}
