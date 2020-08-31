package linkedList;


public class RemoveDuplicatesFromEnd {
	
	Node head;
	
	public static class Node{
		
		int data;
		
		public Node next;
		
		public Node(int data) {
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
	
	public Node removeNthElementFromEnd(Node head, int n) {
		
		Node dummy = new Node(0);
		
		dummy.next = head;
		
		Node node = head;
		
		int len = 0;
		
		while(node != null) {
			len++;
			node = node.next;
			
		}
		
		len -= n;
		
		node = dummy;
		
		while(len>0) {
			len--;
			node = node.next;
		}
		
		Node nullNode = node.next;
		
		node.next = node.next.next;
		
		nullNode = null;
		
		return dummy.next;
		
	}
	
	public Node returnHead() {
		return head;
	}

}
