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
			Node<T> temp = head;
			while(temp.getNext() != null)
				temp = temp.getNext();
			
			temp.setNext(node);
		}
	}
	
	public void print() {
		Node<T> temp = head;
		while(temp != null){
			System.out.print(temp.getValue()+" ");
			temp = temp.getNext();
		}
		System.out.println();
	}
	
	public static void main(String str[])
	{
		SinglyList<Integer> obj = new SinglyList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		char cr = 0 ;
		
		do {
			System.out.println("Enter Your Choice");
			System.out.println("1. Insert node in starting.");
			System.out.println("2. Print List.");
			
			cr = sc.nextLine().charAt(0);
			
			switch (cr) {
			case '1':
				System.out.println("Enter the value:");
				int val = sc.nextInt();
				obj.addInFront(val);
				break;
	
			case '2':
				obj.print();
				break;
				
			default:
				break;
			}
			
		} while(cr == 'Y' || cr == 'y');
	}
}
