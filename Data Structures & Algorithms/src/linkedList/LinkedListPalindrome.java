package linkedList;



public class LinkedListPalindrome {
	
	private Node head;
	private Node second_half;
	
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
	
	
	public boolean isPalindromeByReversing() {
		
		Node slowPtr = head;
		Node fastPtr = head;
		Node middlePTR = null;
		Node prevSlowPTR = head;
		
		boolean res = true;
		
		if(head != null && head.next != null) {
			
			while (fastPtr != null && fastPtr.next != null) {
				fastPtr = fastPtr.next.next;
				
				prevSlowPTR = slowPtr;
				slowPtr = slowPtr.next;
			}
		}
		
		if(fastPtr != null) {
			middlePTR = slowPtr;
			slowPtr = slowPtr.next;
		}
		
		second_half = slowPtr;
		prevSlowPTR.next = null;
		
		reverse();
		res = compareLists(head, second_half);
		reverse();
		
		if(middlePTR != null) {
			prevSlowPTR.next = middlePTR;
			middlePTR.next = second_half;
		}else {
			prevSlowPTR.next = second_half;
		}
		
		
		return res;
	}
	
	 /* Function to reverse the linked list  Note that this
    function may change the head */
	void reverse() 
	{
     Node prev = null;
     Node current = second_half;
     Node next;
     while (current != null) 
     {
         next = current.next;
         current.next = prev;
         prev = current;
         current = next;
     }
     second_half = prev;
	}

 /* Function to check if two input lists have same data*/
	boolean compareLists(Node head1, Node head2) 
	{
     Node temp1 = head1;
     Node temp2 = head2;

     while (temp1 != null && temp2 != null) 
     {
         if (temp1.data == temp2.data) 
         {
             temp1 = temp1.next;
             temp2 = temp2.next;
         } else
             return false;
     }

     /* Both are empty reurn 1*/
     if (temp1 == null && temp2 == null)
         return true;

     /* Will reach here when one is NULL
        and other is not */
     	return false;
	}

}
