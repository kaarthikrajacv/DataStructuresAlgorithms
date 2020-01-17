package linkedList;

public class LinkedListArrange_InPlace {
	
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
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
	}
	
	public Node reverseLinkedList(Node head) {
		
		Node prev = null;
		Node current = head;
		Node next = null;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			
		}
		
		return prev;
	}
	
	public Node findMidLinkedList(Node head) {
		
		Node slow_ptr = head;
		Node fast_ptr = head;
		
		while(fast_ptr != null && fast_ptr.next !=null) {
			slow_ptr = slow_ptr.next;
			fast_ptr = fast_ptr.next.next;
		}
		
		return slow_ptr;
		
	}
	
	public void rearrangeInPlace(Node node1, Node node2) {
		
		
		head = new Node(0);
		Node temp = head;
		while(node1 != null || node2 !=null) {
			
			if(node1 !=null) {
				temp.next = node1;
				node1 = node1.next;
				temp = temp.next;
			}
			
			if(node2 !=null) {
				temp.next = node2;
				node2 = node2.next;
				temp = temp.next;
			}
			
			
		}
		
		head = head.next;
	}

}
