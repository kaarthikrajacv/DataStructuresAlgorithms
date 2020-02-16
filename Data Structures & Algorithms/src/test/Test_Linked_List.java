package test;


import linkedList.AddTwoLLtoFormNewLL;
import linkedList.AddTwoLLtoFormNewLL.Node;

public class Test_Linked_List {

	public static void main(String[] args) {
		
		Node n1 = new Node(1);
		n1.next = new Node(2);
		n1.next.next = new Node(3);
		
		Node n2 = new Node(4);
		n2.next = new Node(5);
		n2.next.next = new Node(6);
		
		
		Node o3 = new AddTwoLLtoFormNewLL().addTwoNumbers(n1, n2);
	}  

}
