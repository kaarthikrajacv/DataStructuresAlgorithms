package test;

import linkedList.*;
import linkedList.DuplicatedLinkedList.Node;

public class Test_Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DuplicatedLinkedList list = new DuplicatedLinkedList();
		Node head;// = list.head;
		head = new Node(9);
		list.head = head;
		
		list.addElementsToLast(5);
		list.addElementsToLast(6);
		//list.addElementsToLast(6);
		list.addElementsToLast(5);
		list.addElementsToLast(9);
		
		list.printLinkedList();
		//list.removeDuplicates();
		list.removeDuplicatesUnsorted();
		System.out.println("After sorting");
		list.printLinkedList();
		
		
		//list.printLinkedList();
		
		
	}  

}
