package DS.LIST;

import java.util.Scanner;

import DS.Node;

public class SinglyList<T> {

	Node<T> head;
	
	public SinglyList() {
		head = null;
	}
	
	public void addInFront(T value) {
		Node<T> node = new Node(value);
		if(head == null)
			head = node;
		else {
			node.setNext(head);
			head = node;
		}
	}
	
	public void addInLast(T value) {
		Node<T> node = new Node(value);
		if(head == null)
			head = node;
		else {
			Node<T> temp = head;
			while(temp.getNext() != null)
				temp = temp.getNext();
			
			temp.setNext(node);
		}
	}
	
	private void addAtPosition(int position, T val) {
		if(position == 0)
			addInFront(val);
		else {
			Node<T> temp = head;
			Node<T> node = new Node<T>(val);
			int pos = 0;
			while(temp != null && pos < position - 1) {
				temp = temp.getNext();
				pos++;
			}
			if(temp == null && pos == position)
				temp.setNext(node);
			else if(temp==null && pos<position)
				System.out.println("Position is out of list");
			else {
				node.setNext(temp.getNext());
				temp.setNext(node);
			}
		}
	}
	
	private void deleteAtFront()
	{
		if(head == null)
			System.out.println("List is Empty");
		else 
			head = head.getNext();
	}
	
	private void deleteAtLast()
	{
		if(head == null)
			System.out.println("List is Empty");
		else if(head.getNext() == null) 
			head = null;
		else {
			Node<T> temp = head;
			while(temp.getNext().getNext() != null)
				temp = temp.getNext();
			
			temp.setNext(null);
		}
	}
	
	private void deleteAfterPosition(int position)
	{
		if(head == null)
			System.out.println("List is empty");
		else if(position == 0)
			head = head.getNext();
		else {
			Node<T> temp = head;
			int pos = 0;
			while(temp.getNext() != null && pos < position - 1) {
				temp = temp.getNext();
				pos++;
			}
			if(temp.getNext() == null && pos < position)
				System.out.println("Position is out of list");
			else {
				temp.setNext(temp.getNext().getNext());
			}
		}
	}
	
	public void print() {
		if(head == null)
			System.out.println("List is Empty");
		else {
			Node<T> temp = head;
			while(temp != null){
				System.out.print(temp.getValue()+" ");
				temp = temp.getNext();
			}
			System.out.println();
		}
	}
	
	public static void main(String str[])
	{
		SinglyList<Integer> obj = new SinglyList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		char cr = 0 ;
		char cont = 0;
		do {
			System.out.println("----------------------------");
			System.out.println("Enter Your Choice");
			System.out.println("1. Insert node in starting.");
			System.out.println("2. Insert node in last.");
			System.out.println("3. Insert node at position.");
			System.out.println("4. Delete from starting.");
			System.out.println("5. Delete from last.");
			System.out.println("6. Delete after position.");
			System.out.println("9. Print List.");
			
			System.out.println("----------------------------");
			
			cr = sc.next().charAt(0);
			int val = 0 ;
			switch (cr) {
			case '1':
				System.out.println("Enter the value:");
				val = sc.nextInt();
				obj.addInFront(val);
				break;
			
			case '2':
				System.out.println("Enter the value:");
				val = sc.nextInt();
				obj.addInLast(val);
				break;
			
			case '3':
				System.out.println("Enter the Position After which node is to be inserted:");
				int position = sc.nextInt();
				System.out.println("Enter the Value:");
				val = sc.nextInt();
				obj.addAtPosition(position,val);
				break;
	
			case '4':
				obj.deleteAtFront();
				break;
			
			case '5':
				obj.deleteAtLast();
				break;
			
			case '6':
				System.out.println("Enter the Position After which node is to be deleted:");
				int position1 = sc.nextInt();
				obj.deleteAfterPosition(position1);
				break;
				
			case '9':
				obj.print();
				break;
				
			default:
				break;
			}
			System.out.println("Wish to continue?Y/N");
			cont = sc.next().charAt(0);
		} while(cont == 'Y' || cont == 'y');
	}

	
}
