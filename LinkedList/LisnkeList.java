package linkedList;

import java.util.ArrayList;

public class LinkedList {

	//ArrayList<MyNode> arr = new ArrayList<MyNode>();
	MyNode head = null ;






	public void  addFirst(Object o)
	{
		MyNode<Object>	myFirstNode = new MyNode<>(o);
		if(head==null) {
			head = myFirstNode;
		}else {

			myFirstNode.setNext(head);
			head = myFirstNode;

		}


	}





	public void  append(Object o)
	{
		MyNode<Object>	myFirstNode = new MyNode<>(o);
		if(head==null) {
			head = myFirstNode;
		}else {

			MyNode last= lastNode();
			last.setNext(myFirstNode);
		}

	}





	public void remove() {


	}





	public void print() {

		MyNode first = head;
		if(first == null)return;
		while(first.getNext() != null ) {
			System.out.println(first.getKey());
			first = first.getNext();
		}
		System.out.println(first.getKey());

	}




	public MyNode lastNode() {

		MyNode first = head; 
		while(first.getNext() != null ) {

			first = first.getNext();

		}
		return first;

	}


	public void size() {

		MyNode first = head; 
		int count=0;
		if (head==null)System.out.println(count);
		while(first.getNext() != null ) {
			count ++;
			first = first.getNext();

		}
		count++;
		System.out.println(count);

	}


	public boolean isEmpty() {

		if(head==null)return false;
		return true;

	}


	public void deleteLast() {
		MyNode first = head,zeroth=null;
		while(first.getNext() != null ) {
			zeroth = first;
			first = first.getNext();

		}
		zeroth.setNext(null);

	}

	public void search(Object o) {

		MyNode first = head;
		int count=0;
		while(first.getNext() != null ) {

			if(first.getKey() == o) {
				System.out.println("the position of the value is in position "+count);
				return;
			}
			count++;
			first = first.getNext();

	}

		if( first.getKey() == o) {
			System.out.println("the position of the value is in position "+count);
			return;
		}
		System.out.println("the element ur searching is not found");

	}


	public void delValue(Object o) {

		MyNode first= head,zero=null;

		if(first.getKey() == o)
			head = first.getNext();

		while(first.getNext() != null ) {
			if(first.getKey() == o)
				break;
			zero = first;
			first = first.getNext();
		}
		zero.setNext(first.getNext());
	}


	public void insertBetween(Object o1, Object o2, Object o3) {

		MyNode first = head;
		int count=0;
		while(first.getNext() != null ) {

			if(first.getKey() == o1) {
				MyNode second= first.getNext();
				if(second.getKey() == o2) {
					MyNode<Object>	myFirstNode = new MyNode<>(o3);
					first.setNext(myFirstNode);
					myFirstNode.setNext(second);
					System.out.println("Insertion succesfull");
					return;

				}
			}

			first = first.getNext();

		}
		System.out.println("entered elements not found : hence filed .");	

	}



	public void sort() {

		MyNode first = head , second=null,min=first;
		while(first.getNext() != null) {
			//if()
		}

	}





}
