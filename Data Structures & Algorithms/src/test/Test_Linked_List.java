package test;

import linkedList.*;
import linkedList.RemoveDuplicatesSortedLinkedList.Node;

public class Test_Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoveDuplicatesSortedLinkedList list = new RemoveDuplicatesSortedLinkedList();
		Node head;// = list.head;
		head = new Node(3);
		list.head = head;
		
		list.addElementsToLast(3);
		list.addElementsToLast(5);
		list.addElementsToLast(5);
		list.addElementsToLast(7);
		list.addElementsToLast(7);
		
		list.printLinkedList();
		//list.removeDuplicates();
		list.remDuplicatesImplementation2();
		System.out.println("After sorting");
		list.printLinkedList();
		
		
		//list.printLinkedList();
		
		
	}  

}
