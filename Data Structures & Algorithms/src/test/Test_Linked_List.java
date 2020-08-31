package test;



import linkedList.ReverseInGroups;
import linkedList.ReverseInGroups.Node;

public class Test_Linked_List {

	public static void main(String[] args) {
		
		ReverseInGroups  merge = new ReverseInGroups();
		
		merge.addElementsToLast(1);
		
		merge.addElementsToLast(2);
		
		merge.addElementsToLast(3);
		
		merge.addElementsToLast(4);
		

		merge.printLinkedList(null);
		
		Node temp = merge.reverseKGroup(merge.returnHead(), 3);
		
		merge.printLinkedList(temp);
	}  

}
