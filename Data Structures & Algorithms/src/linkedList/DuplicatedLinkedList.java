package linkedList;

import java.util.HashSet;

public class DuplicatedLinkedList {
	
	public Node head;
		
	public static class Node{
		
		int data;
		public Node next;
		
		public Node(int data){
			this.data = data;
		}
	}
	
	public void addElementsToLast(int data) {
		
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
	
	public void printLinkedList() {
		
		Node tnode = head;
        while (tnode != null)
        {
            System.out.println(tnode.data);
            tnode = tnode.next;
        }
	}
	
	public void removeDuplicates() {
		
		Node temp = head;
		Node current = null;
		Node next = null;
		if(temp == null) {
			return;
		}
		
		while(temp.next != null) {
			if(temp.data == temp.next.data) {
				current = temp;
				next = temp.next.next;
				temp.next = null;
				current.next = next;
				temp = next;
			}
			temp = temp.next;
		}
	}
	
	public void removeDuplicatesUnsorted() {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		Node temp = head;
		Node prev = null;
		
		while(temp != null) {
			if(hs.contains(temp.data)){
				prev.next = temp.next;
			}else {
				hs.add(temp.data);
				prev = temp;
				
			}
			temp = temp.next;
		}
	}
	

}
