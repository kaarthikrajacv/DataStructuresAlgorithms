package linkedList;

public class ReverseLinkedListInPairs {
	
	private Node head;
	
	private static class Node{
			
			int val;
			public Node next;
			
			public Node(int data){
				this.val = data;
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
	
	private void printLinkedList(Node tNode) {
		
		if(tNode == null) {
			tNode = head;
		}
		
        while (tNode != null)
        {
            System.out.print(tNode.val);
            
            tNode = tNode.next;
        }
        
        System.out.println("\n");
	}
	
	
	public Node reverseLinkedListInPairs(Node head) {
		
		Node dummy = new Node(0);
	    dummy.next = head;
	    Node current = dummy;
	    while (current.next != null && current.next.next != null) {
	    	Node first = current.next;
	    	Node second = current.next.next;
	        first.next = second.next;
	        current.next = second;
	        current.next.next = first;
	        current = current.next.next;
	    }
	    return dummy.next;
    }
	
	public Node returnHead() {
		return head;
	}
		
		
	}


