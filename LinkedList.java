package LinkedList;

public class LinkedListJava {
	
	
	private class Node{
		
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	private int size;
	 Node head;
	 Node tail;
	
	public int size() {
		return this.size;
		
	}
	private void insert(int data) {
		Node toAdd=new Node(data);
		
		if(head==null) {
			head=toAdd;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=toAdd;
		}
	}
	private void insertAtStart(int data) {
		Node node=new Node(data);
		node.next=head;
		head=node;
	}
	private void insertAtLast(int data) {
		Node node=new Node(data);
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=node;
	}
	private void insertAtMiddle(int index, int data) {
		Node node=new Node(data);
		Node temp=head;
		for(int i=0;i<index-1;i++) {
			temp=temp.next;
		}
		node.next=temp.next;
		temp.next=node;
	}
	private void delete(int index) {
		
		Node temp=head;
		for(int i=0;i<index-1;i++) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
	}
	public void show() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			
			temp=temp.next;
		}
		
	}
	public static void main(String[] args) {
		
		LinkedListJava linkedListJava=new LinkedListJava();
		linkedListJava.insert(5);
		linkedListJava.insert(6);
		linkedListJava.insert(7);
		linkedListJava.show();
		System.out.println();
		linkedListJava.insertAtStart(10);
		linkedListJava.show();
		System.out.println();
		linkedListJava.insertAtLast(8);
		linkedListJava.show();
		System.out.println();
		linkedListJava.insertAtMiddle(2, 55);
		linkedListJava.show();
		System.out.println();
		linkedListJava.delete(2);
		linkedListJava.show();
		System.out.println();
	}
}

