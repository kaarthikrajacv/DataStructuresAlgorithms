package linkedList;

import java.util.PriorityQueue;

public class MergeKSortedLinkedList {

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
	
	public Node mergeKList(Node[] lists) {
		
		PriorityQueue<Node> queue = new PriorityQueue<>(lists.length, (a,b) -> a.val - b.val);
		
		Node dummy = new Node(0);
		
		Node tail = dummy;
		
		for (Node node : lists) {
			
			if(node != null) {
				queue.add(node);
			}
			
		}
		
		while(!queue.isEmpty()) {
			
			tail.next = queue.poll();
			tail = tail.next;
			
			if(tail.next != null) {
				queue.add(tail.next);
			}
			
		}
		
		return dummy.next;
		
	}
	
	private Node returnHead() {
		return head;
	}
	
}
