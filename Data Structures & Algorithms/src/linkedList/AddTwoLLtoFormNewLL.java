package linkedList;


public class AddTwoLLtoFormNewLL {
	
public Node head;
	
	public static class Node{
		
		int val;
		public Node next;
		
		public Node(int data){
			this.val = data;
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
	
	public Node addTwoNumbers(Node l1, Node l2) {
        
		Node dummyHead = new Node(0);
	    Node p = l1, q = l2, curr = dummyHead;
	    int carry = 0;
	    while (p != null || q != null) {
	        int x = (p != null) ? p.val : 0;
	        int y = (q != null) ? q.val : 0;
	        int sum = carry + x + y;
	        carry = sum / 10;
	        curr.next = new Node(sum % 10);
	        curr = curr.next;
	        if (p != null) p = p.next;
	        if (q != null) q = q.next;
	    }
	    if (carry > 0) {
	        curr.next = new Node(carry);
	    }
	    return dummyHead.next;
	
	}
}
