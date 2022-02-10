package linkedList;


public class MyNodeTest {

	public static void main(String[] args) {

		given3NumbersWhenLinkedShouldPassedLinkedListTest();

	}


	public static void given3NumbersWhenLinkedShouldPassedLinkedListTest(){

		LinkedList link = new LinkedList();

		link.append(56);
		link.append(70);
		link.insertBetween(56,70,30)
		link.print();

	}
}




