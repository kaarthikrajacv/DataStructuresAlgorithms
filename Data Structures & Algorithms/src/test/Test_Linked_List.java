package test;

import linkedList.*;
import linkedList.ReverseLinkedList.Node;

public class Test_Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseLinkedList list = new ReverseLinkedList();
		Node head;// = list.head;
		head = new Node(9);
		list.head = head;
		
		list.addElementsToLast(5);
		list.addElementsToLast(6);
		list.addElementsToLast(4);
		list.addElementsToLast(3);
		
		list.reverseLinkedList();
		list.printLinkedList();
		
		
	}  

}
