package linkedList;


public class SearchElement {
	
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
	
	public boolean searchIterative(int data) {
		
		Node temp = head;
		while(temp != null) {
			if(temp.data == data) {
				return true;
				
			}
			temp = temp.next;			
		}
		return false;
	}
	
	public boolean searchRecursive(Node temp, int data) {
		
		if(temp == null) {
			return false;
		}
		
		if(temp.data == data) {
			return true;
		}
		
		
		return searchRecursive(temp.next, data);	
			
		
	}
	
	public int getElementByIndex(int index) {
		
		try {
		Node temp = head;
		for (int i=0;i<index;i++) {
			temp = temp.next;
		}
		
		return temp.data;
		}catch(NullPointerException e) {
			
			System.out.println("No Such Index in the given list");
			return -1;
		}
	}
	
	public int getFrequencyIteration( int data) {
		int counter = 0;
		Node temp = head;
		if(temp == null) {
			return counter;
		}
		while(temp != null) {
			if(temp.data == data) {
				counter++;
			}
			temp = temp.next;
		}
		
		return counter;
	}

}

