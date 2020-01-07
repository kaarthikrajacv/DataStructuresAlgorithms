package linkedList;



public class RemoveDuplicatesSortedLinkedList {
	
	public Node head;
	
	public static class Node{
		
		int data;
		public Node next;
		
		public Node(int data){
			this.data = data;
		}
	}
	
	
	public void removeDuplicatesFromSortedList() {
		
		Node node = head;
		
		while(node != null && node.next != null) {
			if(node.data == node.next.data) {
				Node temp = node;
				while(temp.next != null && temp.data == temp.next.data) {
					temp = temp.next;
				}
				node.next = temp.next;
			}
			node = node.next;
		}
		
	}
	
	public void remDuplicatesImplementation2() {
		/*Another reference to head*/
        Node curr = head; 
  
        /* Traverse list till the last node */
        while (curr != null) { 
             Node temp = curr; 
            /*Compare current node with the next node and  
            keep on deleting them until it matches the current  
            node data */
            while(temp!=null && temp.data==curr.data) { 
                temp = temp.next; 
            } 
            /*Set current node next to the next different  
            element denoted by temp*/
            curr.next = temp; 
            curr = curr.next; 
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
}
