package linkedList;

public class LengthOfLinkedList {
	
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
	
	public int lengthIterative() {
		
		int counter = 0;
		if(head == null) {
			return 0;
		}else {
			Node temp = head;
			while(temp != null) {
				counter++;
				temp = temp.next;
			}
		}return counter;
		
	}
	
	public int printRecursive(Node temp) {
			
		if(temp == null) {
			return 0;
		}
		
		return 1+printRecursive(temp.next);
	}
		
	}
