package linkedList;


public class MyNodeTest {

	public static void main(String[] args) {

		given3NumbersWhenLinkedShouldPassedLinkedListTest();

	}


	public static void given3NumbersWhenLinkedShouldPassedLinkedListTest(){

		LinkedList link = new LinkedList();
		
		link.append(56);
		link.append(30);
		link.append(70);
		link.print();
		
	}
}




