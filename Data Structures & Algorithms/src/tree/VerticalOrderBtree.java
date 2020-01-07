package tree;

import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;

public class VerticalOrderBtree {
	
	
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
	
	public static void getVerticalOrder(Node root, int hd, TreeMap<Integer, Vector<Integer>> m) {
		
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
		
		getVerticalOrder(root.left, hd-1, m);
		getVerticalOrder(root.right, hd+1, m);
		
	}
	
	public static void printVerticalOrder(Node root) {
		TreeMap<Integer,Vector<Integer>> m = new TreeMap<>(); 
        int hd =0; 
        getVerticalOrder(root,hd,m); 
         
        for (Entry<Integer, Vector<Integer>> entry : m.entrySet()) 
        { 
            System.out.println(entry.getValue()); 
        }
	}

}
