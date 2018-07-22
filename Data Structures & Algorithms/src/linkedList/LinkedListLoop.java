package linkedList;

import java.util.HashSet;

public class LinkedListLoop {
	
	private Node head;
	
	private static class Node{
		
		int data;
		public Node next;
		
		public Node(int data){
			this.data = data;
		}
	}
	
	private void addElementsToLast(int data) {
		
		if(head == null) {
			
			head = new Node(data);
			return;
		}else {
			Node temp;
			temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node(data);
			return;
		
		}

	}
	
	private void printLinkedList() {
		
		Node tnode = head;
        while (tnode != null)
        {
            System.out.println(tnode.data);
            tnode = tnode.next;
        }
	}
	
	public boolean detectLoopHashing(Node h) {
		
		HashSet<Node> s = new HashSet<Node>();
		while(h != null) {
			if(s.contains(h)) {
				return true;
			}
			s.add(h);
			h = h.next;
		}
		
		return false;
		
	}
	
	public boolean detectLoop_Floyds_Cycle_Algorithm() {
		Node a = head;
		Node b = head;
		
		while(a != null && b!= null && b.next != null) {
			a = a.next;
			b = b.next.next;
			
			if(a==b) {
				return true;
			}
		}
		return false;
		
	}
	
	public int detectLoopLength_Floyds_Cycle_Algorithm() {
		Node a = head;
		Node b = head;
		int counter = 1;
		
		while(a != null && b!= null && b.next != null) {
			a = a.next;
			b = b.next.next;
			counter += 1;
			if(a==b) {
				break;
			}
		}
		return counter;
		
	}
	
	
	
	

}
