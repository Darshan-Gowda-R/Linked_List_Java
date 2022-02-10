package linkedList;


public class MyNodeTest {

	public static void main(String[] args) {

		given3NumbersWhenLinkedShouldPassedLinkedListTest();

	}


	public static void given3NumbersWhenLinkedShouldPassedLinkedListTest(){

		MyNode l1 = new MyNode(56);
		MyNode l2 = new MyNode(30);
		MyNode l3 = new MyNode(70);

		l1.setNext(l2);
		l2.setNext(l3);

		MyNode first=l1;
		while(first.getNext() != null ) {
			System.out.println(first.getKey());
			first=first.getNext();
		}
		System.out.println(first.getKey());
	}
}




