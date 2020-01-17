package test;

import linkedList.*;
import linkedList.LinkedListArrange_InPlace.Node;

public class Test_Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListArrange_InPlace list = new LinkedListArrange_InPlace();
		Node head;// = list.head;
		head = new Node(1);
		list.head = head;
		
		list.addElementsToLast(2);
		list.addElementsToLast(3);
		list.addElementsToLast(4);
		list.addElementsToLast(5);
		//list.addElementsToLast(6);
		
		list.printLinkedList();
		//list.removeDuplicates();
		Node mid = list.findMidLinkedList(head);
		Node node1 = head;
		Node node2 = mid.next;
		mid.next = null;
		
		node2 = list.reverseLinkedList(node2);
		list.rearrangeInPlace(node1,node2);
		System.out.println("After inplace sorting");
		list.printLinkedList();
		
		
		//list.printLinkedList();
		
		
	}  

}
