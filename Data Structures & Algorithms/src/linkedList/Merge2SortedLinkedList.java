package linkedList;

public class Merge2SortedLinkedList {
	
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
	
	private void printLinkedList() {
		
		Node tNode = head;
        while (tNode != null)
        {
            System.out.println(tNode.val);
            tNode = tNode.next;
        }
	}
	
	private Node mergeTwoList(Node l1, Node l2)
	{
	
		Node l = new Node(0);
        Node l3 = l;
        
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        
        while(l1 != null && l2 != null){
            
            if(l1 != null && l2 != null && l1.val <= l2.val){
                l3.next = l1;
                l1 = l1.next;
                //l2 = l2.next;
                l3 = l3.next;
            }
            if(l1 != null && l2 != null && l2.val <= l1.val){
                l3.next = l2;
                //l1 = l1.next;
                l2 = l2.next;
                l3 = l3.next;
            }
            if(l1 == null && l2 != null){
                l3.next = l2;
                l3 = l3.next;
                l2 = l2.next;
            }
            if(l1 != null && l2 == null){
                l3.next = l1;
                l3 = l3.next;
                l1 = l1.next;
            }
        }
        
        return l.next;
	}
}
