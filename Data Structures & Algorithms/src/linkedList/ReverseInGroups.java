package linkedList;


public class ReverseInGroups {
	
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
	
	public void printLinkedList(Node tNode) {
		
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
	
public Node reverseKGroup(Node head, int k) {
        
        if(head == null || head.next == null || k == 1){
            return head;
        }
        
        Node dummy = new Node(0);
        
        dummy.next = head;
        
        Node begin = dummy;
        
        int i = 0;
        
        while(head != null){
            i++;
            
            if(i%k == 0){
                begin = reverse(begin, head.next);
                head = begin.next;
            }else{
                head = head.next;
            }
        }
        
        return dummy.next;
        
    }
    
    public Node reverse(Node begin, Node end){
        
        Node curr = begin.next;
        Node next, first;
        Node prev = begin;
        first = curr;
        
        while(curr != end){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        begin.next = prev;
        first.next = curr;
        return first;
    }
    
    public Node returnHead() {
		return head;
	}

}
