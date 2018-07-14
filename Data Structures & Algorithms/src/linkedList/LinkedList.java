package linkedList;

public class LinkedList {
	
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
	
	public void addElementsToLast(Node head, int data) {
		
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
	
	public void printLinkedList(Node head) {
		
		Node tnode = head;
        while (tnode != null)
        {
            System.out.println(tnode.data);
            tnode = tnode.next;
        }
	}
	
	public void addElementToFirst(int data) {
		
		Node temp = new Node(data);
		temp.next =head;
		head = temp;
		
	}
	
	public void addElementToIndex(int data, int index) {
		
		Node newNode = new Node(data);
		Node temp = head;
		Node endNode = null;
		try {
		for(int i=0;i<index-1;i++) {
			
			temp = temp.next;
			endNode = temp.next;
			
		}
		temp.next = newNode;
		newNode.next = endNode;
		}catch(NullPointerException e) {
			System.out.println("Index dosen't exist");
		}
		
	}
	
	public void deleteHead() {
		
		head = head.next;
	}
	
	public void deleteLastNode() {
		
		Node temp = head;
		while (temp.next.next !=null) {
			temp = temp.next;
		}
		
		temp.next = null;
		
		
	}
	
	public void deleteNodeInMiddle(int data) {
		
		Node prev = null;
		Node current = head;
		
		if(current == null) {return;}
		
		if(current.data == data) {
			head = current.next;
			current = null;
			return;
		}
		
		while(current.data != data) {
			prev = current;
			current = current.next;
			if(current == null) {
				System.out.println("Search Node not found");
				return;
			}
		}
		
		prev.next = current.next;
		current = null;
		
	}
}
